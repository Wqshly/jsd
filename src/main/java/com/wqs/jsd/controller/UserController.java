package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Staff;
import com.wqs.jsd.pojo.StaffUser;
import com.wqs.jsd.pojo.User;
import com.wqs.jsd.service.StaffUserService;
import com.wqs.jsd.util.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    @Autowired
    private CommonMethod commonMethod;

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

    // 上传头像

    @PostMapping("/imageUpload")
    public ResultBean<String> UploadImage(@RequestParam(value = "picture", required = false) MultipartFile picture, HttpServletRequest request) throws IOException {
        return commonMethod.UploadImage(picture, request, "/uploadUserImg");
    }
}
