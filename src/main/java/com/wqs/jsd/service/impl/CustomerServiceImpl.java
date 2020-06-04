package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.CustomerMapper;
import com.wqs.jsd.manager.SendSms;
import com.wqs.jsd.pojo.Customer;
import com.wqs.jsd.service.CustomerService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import com.wqs.jsd.util.RSACode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.SUCCESS;
import static com.wqs.jsd.beans.ResultBean.UNKNOWN_EXCEPTION;

/**
 * @Author: wan
 * @Date: Created in 20:15 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Resource
    private CustomerMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Autowired
    private SendSms sendSms;

    @Override
    public ResultBean<Void> getVerifyCode(String phoneNumber) {
        try {
            int codeNumber = sendSms.randomCode(6);
            sendSms.sendSms("SMS_192230877", phoneNumber, codeNumber);
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
            byte[] decodedData = RSACode.decryptByPrivateKey(record.getPassword());
            String password = new String(decodedData);
            record.setPassword(commonMethod.MD5EncryptSalt(password, "wqs"));
            return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
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
}