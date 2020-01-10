package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Staff;
import com.wqs.jsd.pojo.StaffUser;
import com.wqs.jsd.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Author: wan
 * @Date: Created in 16:04 2019/12/25
 * @Description:
 * @Modified By:
 */
@Service
public interface StaffUserService {

    /**
     * @param staffUser
     * @description:
     * @return: ResultBean
     * @author: van
     * @time: 2020/1/9 12:56
     */
    ResultBean<Staff> login(StaffUser staffUser);

    /**
     * @param staffUser
     * @description:
     * @return:
     * @author: van
     * @time: 2019/12/27 11:08
     */
    StaffUser getLoginInfo(StaffUser staffUser);

    /**
     * @param staffUser
     * @return staffUser
     * 初始注册
     */
    int initRegister(StaffUser staffUser);

    /**
     * @param staff 初始注册的录入
     */
    boolean initRegister(Staff staff);

    /**
     * @param user 初始注册的录入
     */
    boolean initRegister(User user);

    /**
     * @param user
     * @return count
     * 添加用户
     */
    Integer insertUserRecord(User user);

    /**
     * @param staff
     * @return count
     * 添加员工
     */
    Integer insertStaffRecord(Staff staff);
}
