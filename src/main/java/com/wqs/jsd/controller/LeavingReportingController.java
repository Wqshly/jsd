package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.LeavingReporting;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.LeavingReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 11:06 2020/4/15
 * @Description:
 * @Modified By:
 */
@RequestMapping("/leavingReporting")
@RestController
public class LeavingReportingController {
    @Autowired
    private LeavingReportingService leavingReportingService;

    @PostMapping("addLeavingReporting")
    public ResultBean<Void> insertLeavingReportingRecord(@RequestBody LeavingReporting record) {
        return leavingReportingService.insertLeavingReportingRecord(record);
    }

    @PostMapping("editLeavingReporting")
    public ResultBean<Void> updateLeavingReportingRecord(@RequestBody LeavingReporting record) {
        return leavingReportingService.updateLeavingReportingRecord(record);
    }

    @GetMapping("findAllLeavingReporting")
    public ResultBean<List<LeavingReporting>> findAllLeavingReporting() {
        return leavingReportingService.findLeavingReportingRecord();
    }

    @PostMapping("findAllLeavingReporting/{staffId}")
    public ResultBean<List<LeavingReporting>> findAllLeavingReporting(@RequestBody PageInfo pageInfo, @PathVariable Integer staffId) {
        return leavingReportingService.findAllLeavingReportingRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize(), staffId);
    }

    @PostMapping("deleteLeavingReporting")
    public ResultBean<Void> deleteLeavingReportingRecord(@RequestBody List<Integer> selectMultipleId) {
        return leavingReportingService.deleteLeavingReportingRecord(selectMultipleId);
    }

}