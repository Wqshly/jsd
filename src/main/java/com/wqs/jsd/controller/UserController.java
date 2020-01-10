package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Staff;
import com.wqs.jsd.pojo.StaffUser;
import com.wqs.jsd.pojo.User;
import com.wqs.jsd.service.StaffUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wan
 * @Date: Created in 15:48 2019/12/25
 * @Description:
 * @Modified By:
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private StaffUserService staffUserService;

    @PostMapping("/initRegister")
    public ResultBean<Void> initRegister(@RequestBody StaffUser staffUser) {
        return new ResultBean<>(staffUserService.initRegister(staffUser), "success");
    }

    @PostMapping("register")
    public ResultBean<User> register(@RequestBody User user) {
        return new ResultBean<>();
    }

    // 登录
    @PostMapping("login")
    public ResultBean<Staff> loginByPhoneCode(@RequestBody StaffUser staffUser) {
        return staffUserService.login(staffUser);
    }
}
