package com.wqs.jsd.service.impl;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.StaffMapper;
import com.wqs.jsd.dao.UserMapper;
import com.wqs.jsd.pojo.Staff;
import com.wqs.jsd.pojo.StaffUser;
import com.wqs.jsd.pojo.User;
import com.wqs.jsd.service.StaffUserService;
import com.wqs.jsd.util.CommonMethod;
import com.wqs.jsd.util.RSACode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.*;
import static com.wqs.jsd.util.CheckUtil.check;
import static com.wqs.jsd.util.CheckUtil.notNull;

/**
 * @Author:
 * @Date: Created in 16:07 2019/12/25
 * @Description:
 * @Modified By:
 */
@Service
public class StaffUserServiceImpl implements StaffUserService {
    private static final Logger logger = LoggerFactory.getLogger(StaffUserService.class);

    @Autowired
    private User user;

    @Resource
    private UserMapper userMapper;

    @Resource
    private StaffMapper staffMapper;

    @Autowired
    private Staff staff;

    /**
     * @param staffUser
     * @description:
     * @return: ResultBean
     * @author: van
     * @time: 2020/1/9 12:56
     */
    @Override
    public ResultBean<Staff> login(StaffUser staffUser) {
        try {
            CommonMethod commonMethod = new CommonMethod();
            int a = staffMapper.countNumberOrPhone(staffUser.getPhone());
            if (a == 1) {
                byte[] decodedData = RSACode.decryptByPrivateKey(staffUser.getPassword());
                String password = new String(decodedData);
                user.userLogin(staffMapper.selectIdByNumberOrPhone(staffUser.getPhone()), commonMethod.MD5EncryptSalt(password, "wqs"));
                if (userMapper.loginByStaffId(user) == 1) {
                    return new ResultBean<>(staffMapper.selectByNumberOrPhone(staffUser.getPhone()), SUCCESS, "登录成功!");
                } else {
                    return new ResultBean<>(LOGIN_FAILED, "登录失败!账号或密码错误!");
                }
            } else if (a == 0) {
                return new ResultBean<>(NOT_EXIST_USER, "该用户不存在!");
            } else {
                return new ResultBean<>(SQL_WRONG, "数据库查出多条数据");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, e.getMessage());
        }
    }

    /**
     * @param staffUser
     * @description:
     * @return:
     * @author: van
     * @time: 2019/12/27 11:08
     */
    @Override
    public StaffUser getLoginInfo(StaffUser staffUser) {
//        staffUser = this.staffUser;
//                System.out.println(staffUser.getPhone());
        return staffUser;
    }

    /**
     * @param staffUser
     * @return staffUser
     * 初始注册
     */
    @Override
    public int initRegister(StaffUser staffUser) {
        try {
            // 当数据库为空时，可执行初始注册
            if (staffMapper.countStaff() == 0) {
                CommonMethod commonMethod = new CommonMethod();
                staff.getStaffInfo("JSD001", staffUser.getName(), staffUser.getSex(), staffUser.getPhone(), staffUser.getIdentify(), "在职", staffUser.getName(), commonMethod.getTime());
                if (this.initRegister(staff)) {
                    byte[] decodedData = RSACode.decryptByPrivateKey(staffUser.getPassword());
                    String password = new String(decodedData);
                    user.userInitRegister(staffMapper.selectIdByPhone(staffUser.getPhone()),
                            commonMethod.MD5EncryptSalt(password, "wqs"), "在职",
                            staffUser.getName(), commonMethod.getTime());
                    this.initRegister(user);
                    return SUCCESS;
                } else {
                    return SQL_EXIST;
                }
            } else {
                return SQL_EXIST;
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return UNKNOWN_EXCEPTION;
        }
    }

    /**
     * @param staff 初始注册的录入
     */
    @Override
    public boolean initRegister(Staff staff) {
        try {
            notNull(staff, "param.is.null");
            //注册并验证
            check(this.insertStaffRecord(staff) > 0, "user.register.error");
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    /**
     * @param user 初始注册的录入
     */
    @Override
    public boolean initRegister(User user) {
        try {
            notNull(user, "param.is.null");
            //注册并验证
            check(this.insertUserRecord(user) > 0, "user.register.error");
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    /**
     * @param user
     * @return count
     * 添加用户
     */
    @Override
    public Integer insertUserRecord(User user) {
        Integer code;
        try {
            code = userMapper.insert(user);
        } catch (Exception e) {
            logger.error(e.getMessage());
            code = 9;
        }
        return code;
    }

    /**
     * @param staff
     * @return count
     * 添加员工
     */
    @Override
    public Integer insertStaffRecord(Staff staff) {
        Integer code;
        try {
            code = staffMapper.insert(staff);
        } catch (Exception e) {
            logger.error(e.getMessage());
            code = 9;
        }
        return code;
    }
}
