package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.RegisterInfo;
import com.wqs.jsd.pojo.SystemUserInfo;
import com.wqs.jsd.pojo.Staff;
import com.wqs.jsd.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Author: wan
 * @Date: Created in 16:04 2019/12/25
 * @Description:
 * @Modified By:
 */
@Service
public interface RegisterAndLoginService {

    ResultBean<Void> userValid(String s);

    /**
     * @param systemUserInfo
     * @description:
     * @return: ResultBean
     * @author: van
     * @time: 2020/1/9 12:56
     */
    ResultBean<Staff> login(SystemUserInfo systemUserInfo);

    /**
     * @param systemUserInfo
     * @return systemUserInfo
     * 初始注册
     */
//    int initRegister(SystemUserInfo systemUserInfo);
    ResultBean<Void> initRegister(SystemUserInfo systemUserInfo);

    ResultBean<Void> register(RegisterInfo record);

    /**
     * @param user
     * @return count
     * 添加用户
     */
    ResultBean<Void> insertUserRecord(User user);

    /**
     * @param staff
     * @return count
     * 添加员工
     */
    ResultBean<Void> insertStaffRecord(Staff staff);
}
