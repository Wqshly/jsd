package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.*;
import com.wqs.jsd.service.RegisterAndLoginService;
import com.wqs.jsd.service.UserHeadSculptureService;
import com.wqs.jsd.util.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
    private RegisterAndLoginService registerAndLoginService;

    @Autowired
    private UserHeadSculptureService userHeadSculptureService;

    @Autowired
    private CommonMethod commonMethod;

    @GetMapping("/getImgUrl/{id}")
    public ResultBean<String> getImgUrl(@PathVariable String id) {
        return userHeadSculptureService.getImgUrl(id);
    }

    @PostMapping("/initRegister")
    public ResultBean<Void> initRegister(@RequestBody SystemUserInfo systemUserInfo) {
        return registerAndLoginService.initRegister(systemUserInfo);
    }

    @PostMapping("register")
    public ResultBean<Void> register(@RequestBody RegisterInfo record) {
        return registerAndLoginService.register(record);
    }

    // 登录
    @PostMapping("login")
    public ResultBean<Staff> loginByPhoneCode(@RequestBody SystemUserInfo systemUserInfo) {
        return registerAndLoginService.login(systemUserInfo);
    }

    @PostMapping("imageUpload")
    public ResultBean<String> UploadImage(@RequestBody ImageFile imageFile) {
        System.out.println(imageFile.getFile());
        return commonMethod.UploadImage(imageFile.getName(), imageFile.getFile(), "/uploadUserImg");
    }

    @PostMapping("/isUserExist")
    public ResultBean<Boolean> isUserExist(@RequestBody String phoneNum, HttpServletRequest request) {
        return new ResultBean<>();
    }

}
