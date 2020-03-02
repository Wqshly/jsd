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

import static com.wqs.jsd.beans.ResultBean.*;

/**
 * @Author:
 * @Date: Created in 16:07 2019/12/25
 * @Description:
 * @Modified By:
 */
@Service
public class PCStaffUserServiceImpl implements StaffUserService {
    private static final Logger logger = LoggerFactory.getLogger(StaffUserService.class);

    @Autowired
    private User user;

    @Resource
    private UserMapper userMapper;

    @Resource
    private StaffMapper staffMapper;

    @Autowired
    private Staff staff;

    @Autowired
    private CommonMethod commonMethod;

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
                String s = commonMethod.MD5EncryptSalt("jwc161813", "wqs");
                System.out.println(s);
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
     * @return staffUser
     * 初始注册
     */
    @Override
    public ResultBean<Void> initRegister(StaffUser staffUser) {
        try {
            if (staffMapper.countStaff() != 0) {
                return new ResultBean<>(SQL_EXIST, "数据库已有初始用户!");
            } else {
                CommonMethod commonMethod = new CommonMethod();
                Staff staff = new Staff("JSD001", staffUser.getName(), staffUser.getSex(), staffUser.getPhone(),
                        staffUser.getIdentify(), "在职", staffUser.getName(), commonMethod.getTime());
                int a = staffMapper.insert(staff);
                System.out.println(a);
                byte[] decodedData = RSACode.decryptByPrivateKey(staffUser.getPassword());
                String password = new String(decodedData);
                User user = new User(staffMapper.selectIdByPhone(staffUser.getPhone()),
                        commonMethod.MD5EncryptSalt(password, "wqs"), "在职",
                        staffUser.getName(), commonMethod.getTime());
                int b = userMapper.insert(user);
                System.out.println(b);
                return new ResultBean<>(SUCCESS, "注册成功!");
            }
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
