package com.wqs.jsd.service.impl;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.StaffMapper;
import com.wqs.jsd.dao.UserHeadSculptureMapper;
import com.wqs.jsd.dao.UserMapper;
import com.wqs.jsd.pojo.*;
import com.wqs.jsd.service.RegisterAndLoginService;
import com.wqs.jsd.util.CommonMethod;
import com.wqs.jsd.util.RSACode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.wqs.jsd.beans.ResultBean.*;

/**
 * @Author:
 * @Date: Created in 16:07 2019/12/25
 * @Description:
 * @Modified By:
 */
@Service
public class RegisterAndLoginServiceImpl implements RegisterAndLoginService {
    private static final Logger logger = LoggerFactory.getLogger(RegisterAndLoginService.class);

    @Autowired
    private User user;

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserHeadSculptureMapper sculptureMapper;

    @Resource
    private StaffMapper staffMapper;

    @Autowired
    private Staff staff;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> userValid(String s) {
        try {
            int staffId = staffMapper.selectIdByPhone(s);
            if (staffId != 0 &&userMapper.countByStaffId(staffId) == 0) {
                return new ResultBean<>(SUCCESS, "success");
            } else if (userMapper.countByStaffId(staffId) != 0) {
                return new ResultBean<>(EXIST_USER, "该员工已注册!");
            } else {
                return new ResultBean<>(NOT_EXIST_USER, "无该员工!");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, e.getMessage());
        }
    }

    /**
     * @param systemUserInfo
     * @description:
     * @return: ResultBean
     * @author: van
     * @time: 2020/1/9 12:56
     */
    @Override
    public ResultBean<Staff> login(SystemUserInfo systemUserInfo) {
        try {
            int a = staffMapper.countNumberOrPhone(systemUserInfo.getPhone());
            if (a == 1) {
                byte[] decodedData = RSACode.decryptByPrivateKey(systemUserInfo.getPassword());
                String password = new String(decodedData);
                user.userLogin(staffMapper.selectIdByNumberOrPhone(systemUserInfo.getPhone()), commonMethod.MD5EncryptSalt(password, "wqs"));
                if (userMapper.loginByStaffId(user) == 1) {
                    return new ResultBean<>(staffMapper.selectByNumberOrPhone(systemUserInfo.getPhone()), SUCCESS, "登录成功!");
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
     * @param systemUserInfo
     * @return systemUserInfo
     * 初始注册
     */
    @Override
    public ResultBean<Void> initRegister(SystemUserInfo systemUserInfo) {
        System.out.println(systemUserInfo.getNickName());
        try {
            if (staffMapper.countStaff() != 0) {
                return new ResultBean<>(SQL_EXIST, "数据库已有初始用户!");
            } else {
                CommonMethod commonMethod = new CommonMethod();
                Staff staff = new Staff("JSD001", systemUserInfo.getName(), systemUserInfo.getSex(), systemUserInfo.getPhone(),
                        systemUserInfo.getIdentify(), "在职", systemUserInfo.getName(), commonMethod.getTime());
                staffMapper.insert(staff);
                byte[] decodedData = RSACode.decryptByPrivateKey(systemUserInfo.getPassword());
                String password = new String(decodedData);
                User user = new User(staff.getId(), systemUserInfo.getNickName(),
                        commonMethod.MD5EncryptSalt(password, "wqs"), "在职", systemUserInfo.getName(),
                        commonMethod.getTime());
                userMapper.insert(user);
                System.out.println(user.getId());
                UserHeadSculpture userHeadSculpture = new UserHeadSculpture(user.getId(), systemUserInfo.getPicLocation(), "true");
                sculptureMapper.insert(userHeadSculpture);
                return new ResultBean<>(SUCCESS, "注册成功!");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误!");
        }
    }

    @Override
    public ResultBean<Void> register(RegisterInfo record) {
        try {
            byte[] decodedData = RSACode.decryptByPrivateKey(record.getPassword());
            String password = new String(decodedData);
            int staffId = staffMapper.selectIdByPhone(record.getPhone());
            User user = new User(staffId, record.getNickName(), commonMethod.MD5EncryptSalt(password, "wqs"),"在职", record.getNickName(), commonMethod.getTime());
            userMapper.insert(user);
            UserHeadSculpture headSculpture = new UserHeadSculpture(user.getId(), record.getPicLocation(), "true");
            sculptureMapper.insert(headSculpture);
            return new ResultBean<>(SUCCESS, "注册成功!");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误!");
        }
    }

    /**
     * @param user
     * @return count
     * 添加用户
     */
    @Override
    public ResultBean<Void> insertUserRecord(User user) {
        return commonMethod.changeRecord(userMapper.insert(user));
    }

    /**
     * @param staff
     * @return count
     * 添加员工
     */
    @Override
    public ResultBean<Void> insertStaffRecord(Staff staff) {
        return commonMethod.changeRecord(staffMapper.insert(staff));
    }
}
