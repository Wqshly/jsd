package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.pojo.Staff;
import com.wqs.jsd.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    @GetMapping("/staffCount")
    public ResultBean<Integer> staffCount() {
        return new ResultBean<>(staffService.staffCount());
    }

    @PostMapping("editStaff")
    public ResultBean<Void> updateStaff(@RequestBody Staff staff) {
        return staffService.updateStaffRecord(staff);
    }

    @GetMapping("findAllStaff")
    public ResultBean<List<Staff>> findAllStaff() {
        return staffService.selectStaffAll();
    }

    @PostMapping("findAllStaff")
    public ResultBean<List<Staff>> findAllStaff(@RequestBody PageInfo pageInfo) {
        return staffService.selectStaffAll(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("addStaff")
    public ResultBean<Void> addStaff(@RequestBody Staff staff) {
        return staffService.insertStaffRecord(staff);
    }

    @PostMapping("deleteStaff")
    public ResultBean<Void> deleteStaffRecord(@RequestBody List<Integer> selectMultipleId) {
        return staffService.deleteStaffRecord(selectMultipleId);
    }
}
