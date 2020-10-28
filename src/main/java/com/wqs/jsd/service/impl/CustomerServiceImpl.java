package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.CustomerMapper;
import com.wqs.jsd.manager.SendSms;
import com.wqs.jsd.pojo.Customer;
import com.wqs.jsd.pojo.PhoneValidCode;
import com.wqs.jsd.service.CustomerService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import com.wqs.jsd.util.RSACode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.*;

/**
 * @Author: wan
 * @Date: Created in 20:15 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    private HashMap<String, String> map = new HashMap<>();
    private HashMap<String, String> time = new HashMap<>();

    @Resource
    private CustomerMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Autowired
    private SendSms sendSms;

    @Autowired
    private CodeUtil codeUtil;


    @Override
    public ResultBean<Void> quickLoginGetVerify(String phoneNumber) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = dateFormat.format(new Date());
            if (time.containsKey(phoneNumber)) {
                java.util.Date begin = dateFormat.parse(time.get(phoneNumber));
                java.util.Date end = dateFormat.parse(date);
                long between = (end.getTime() - begin.getTime()) / 1000;
                // 1分钟内禁止同一号码重复发送短信
                if (between < 60) {
                    System.out.println("一分钟内禁止重复发送短信");
                    return new ResultBean<>(OVERTIME, "catch the Exception");
                }
            }
            time.put(phoneNumber, date);
            int codeNumber = sendSms.randomCode(6);
            sendSms.sendSms("青岛洁时代", "SMS_205136102", phoneNumber, "{\"code\":\"" + codeNumber + "\"}");
            map.put(phoneNumber, String.valueOf(codeNumber));
            System.out.println(map);
            return new ResultBean<>(SUCCESS, "success");
        } catch (Exception e) {
            return new ResultBean<>(UNKNOWN_EXCEPTION, "获取验证码失败！");
        }
    }

    @Override
    public ResultBean<Void> getVerifyCode(String phoneNumber) {
        try {
            if (mapper.checkPhoneNum(phoneNumber) == 0) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String date = dateFormat.format(new Date());
                if (time.containsKey(phoneNumber)) {
                    java.util.Date begin = dateFormat.parse(time.get(phoneNumber));
                    java.util.Date end = dateFormat.parse(date);
                    long between = (end.getTime() - begin.getTime()) / 1000;
                    // 1分钟内禁止同一号码重复发送短信
                    if (between < 60) {
                        System.out.println("一分钟内禁止重复发送短信");
                        return new ResultBean<>(OVERTIME, "catch the Exception");
                    }
                }
                time.put(phoneNumber, date);
                int codeNumber = sendSms.randomCode(6);
                sendSms.sendSms("青岛洁时代", "SMS_192230877", phoneNumber, "{\"code\":\"" + codeNumber + "\"}");
                map.put(phoneNumber, String.valueOf(codeNumber));
                System.out.println(map);
                return new ResultBean<>(SUCCESS, "success");
            } else {
                return new ResultBean<>(EXIST_USER, "用户已注册！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean<>(UNKNOWN_EXCEPTION, "catch the Exception");
        }
    }

    @Override
    public ResultBean<Boolean> validPhoneNum(String phoneNum) {
        return CommonMethod.validPhoneNum(mapper.validPhoneNum(phoneNum));
    }

    @Override
    public ResultBean<Customer> quickLogin(PhoneValidCode record) {
        try {
            if (map.containsKey(record.getPhone())) {
                if (map.get(record.getPhone()).equals(record.getCode())) {
                    if (mapper.checkPhoneNum(record.getPhone()) == 0) {
                        Customer customer = new Customer();
                        customer.setName(codeUtil.createCode9());
                        customer.setNickName(codeUtil.randomNickName());
                        customer.setPassword(commonMethod.MD5EncryptSalt(record.getPhone(), "wqs"));
                        customer.setPhone(record.getPhone());
                        customer.setSex("男");
                        mapper.insert(customer);
                        map.remove(record.getPhone());
                        System.out.println(map);
                        return new ResultBean<>(customer, SUCCESS, "注册成功！");
                    } else {
                        return new ResultBean<>(
                                mapper.selectByPhone(record.getPhone()), SUCCESS, "登录成功！");
                    }
                } else {
                    System.out.println("验证码错误!");
                    return new ResultBean<>(CODE_WRONG, "验证码错误！");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误！");
    }


    @Override
    public ResultBean<Customer> register4Phone(PhoneValidCode record) {
        try {
            if (map.containsKey(record.getPhone())) {
                if (mapper.checkPhoneNum(record.getPhone()) == 0) {
                    if (map.get(record.getPhone()).equals(record.getCode())) {
                        Customer customer = new Customer();
                        customer.setName(codeUtil.createCode9());
                        customer.setNickName(codeUtil.randomNickName());
                        customer.setPassword(commonMethod.MD5EncryptSalt(record.getPhone(), "wqs"));
                        customer.setPhone(record.getPhone());
                        customer.setSex("男");
                        mapper.insert(customer);
                        map.remove(record.getPhone());
                        System.out.println(map);
                        return new ResultBean<>(customer, SUCCESS, "注册成功！");
                    } else {
                        System.out.println("验证码错误!");
                        return new ResultBean<>(CODE_WRONG, "验证码错误！");
                    }
                } else {
                    return new ResultBean<>(EXIST_USER, "用户已注册！");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ResultBean<Void> insertCustomerRecord(Customer record) {
        try {
            byte[] decodedData = RSACode.decryptByPrivateKey(record.getPassword());
            String password = new String(decodedData);
            record.setPassword(commonMethod.MD5EncryptSalt(password, "wqs"));
            return commonMethod.changeRecord(mapper.insert(record));
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> updateCustomerRecord(Customer record) {
        try {
            return commonMethod.changeRecord(mapper.updateByPrimaryKeySelective(record));
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<Customer>> findCustomerRecord() {
        try {
            List<Customer> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Customer> getCustomerInfo(int id) {
        try {
            Customer records = mapper.selectByPrimaryKey(id);
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<Customer>> findAllCustomerRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<Customer> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteCustomerRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public ResultBean<Customer> login4Phone(Customer customer) {
        try {
            System.out.println(customer.getPhone());
            System.out.println(commonMethod.MD5EncryptSalt(customer.getPassword(), "wqs"));
            if (mapper.login4Phone(customer.getPhone(), commonMethod.MD5EncryptSalt(customer.getPassword(), "wqs")) == 1) {
                return new ResultBean<>(mapper.selectByPhone(customer.getPhone()), SUCCESS, "success");
            } else {
                return new ResultBean<>(FAILURE, "wrong");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }
}