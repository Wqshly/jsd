package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.StaffContract;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.StaffContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:53 2020/4/15
 * @Description:
 * @Modified By:
 */
@RequestMapping("/staffContract")
@RestController
public class StaffContractController {
    @Autowired
    private StaffContractService staffContractService;

    @PostMapping("addStaffContract")
    public ResultBean<Void> insertStaffContractRecord(@RequestBody StaffContract record) {
        return staffContractService.insertStaffContractRecord(record);
    }

    @PostMapping("editStaffContract")
    public ResultBean<Void> updateStaffContractRecord(@RequestBody StaffContract record) {
        return staffContractService.updateStaffContractRecord(record);
    }

    @GetMapping("findAllStaffContract")
    public ResultBean<List<StaffContract>> findAllStaffContract() {
        return staffContractService.findStaffContractRecord();
    }

    @PostMapping("findAllStaffContract/{staffId}")
    public ResultBean<List<StaffContract>> findAllStaffContract(@RequestBody PageInfo pageInfo, @PathVariable Integer staffId) {
        return staffContractService.findAllStaffContractRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize(), staffId);
    }

    @PostMapping("deleteStaffContract")
    public ResultBean<Void> deleteStaffContractRecord(@RequestBody List<Integer> selectMultipleId) {
        return staffContractService.deleteStaffContractRecord(selectMultipleId);
    }

}