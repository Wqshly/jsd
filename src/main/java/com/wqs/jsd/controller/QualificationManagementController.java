package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.QualificationManagement;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.QualificationManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 15:35 2020/3/12
 * @Description:
 * @Modified By:
 */
@RequestMapping("/qualification")
@RestController
public class QualificationManagementController {
    @Autowired
    private QualificationManagementService qualificationManagementService;

    @PostMapping("addQualification")
    public ResultBean<Void> insertQualificationManagementRecord(@RequestBody QualificationManagement record) {
        return qualificationManagementService.insertQualificationManagementRecord(record);
    }

    @PostMapping("editQualification")
    public ResultBean<Void> updateQualificationManagementRecord(@RequestBody QualificationManagement record) {
        return qualificationManagementService.updateQualificationManagementRecord(record);
    }

    @GetMapping("findAllQualification")
    public ResultBean<List<QualificationManagement>> findAllQualificationManagement() {
        return qualificationManagementService.findQualificationManagementRecord();
    }

    @PostMapping("findAllQualification")
    public ResultBean<List<QualificationManagement>> findAllQualificationManagement(@RequestBody PageInfo pageInfo) {
        return qualificationManagementService.findAllQualificationManagementRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteQualification")
    public ResultBean<Void> deleteQualificationManagementRecord(@RequestBody List<Integer> selectMultipleId) {
        return qualificationManagementService.deleteQualificationManagementRecord(selectMultipleId);
    }

}