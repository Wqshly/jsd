package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
