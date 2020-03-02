package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Staff;
import com.wqs.jsd.service.PortTypeFactory;
import com.wqs.jsd.service.StaffService;
import com.wqs.jsd.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 16:38 2019/12/26
 * @Description:
 * @Modified By:
 */
@RequestMapping("/staff")
@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;
    @Autowired
    @Qualifier("PCTypeFactory")
    private PortTypeFactory pcType;
    @Autowired
    @Qualifier("mobileTypeFactory")
    private PortTypeFactory mobileType;

    @GetMapping("/staffCount")
    public ResultBean<Integer> staffCount() {
        return new ResultBean<>(staffService.staffCount());
    }

    // 注册员工账号时，用于查询是否有该员工。
    @PostMapping("/staffValid")
    public ResultBean<Boolean> staffValid(@RequestBody String phoneNum, HttpServletRequest request) {
        return staffService.staffValid(phoneNum);
    }

    @PostMapping("editStaff")
    public ResultBean<Void> updateStaff(@RequestBody Staff staff) {
        return staffService.updateStaffRecord(staff);
    }

    @GetMapping("findAllStaff")
    public ResultBean<List<Staff>> findAllStaff() {
        return staffService.selectStaffAll();
    }

    @PostMapping("addStaff")
    public ResultBean<Void> addStaff(@RequestBody Staff staff) {
        return staffService.insertStaffRecord(staff);
    }

//    @PostMapping("addStaff")
//    public ResultBean<Void> addStaff(@RequestBody Staff staff, HttpServletRequest request) throws IOException {
//        String ua = request.getHeader("User-Agent");
//        if (StringUtil.checkAgentIsMobile(ua)) {
//            System.out.println("电脑端使用");
//            return pcType.getStaff().insertStaffRecord(staff);
//        } else {
//            return mobileType.getStaff().insertStaffRecord(staff);
//        }
//    }
}
