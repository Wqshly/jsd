package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.JobChange;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.JobChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 21:42 2020/4/14
 * @Description:
 * @Modified By:
 */
@RequestMapping("/jobChange")
@RestController
public class JobChangeController {
    @Autowired
    private JobChangeService jobChangeService;

    @PostMapping("addJobChange")
    public ResultBean<Void> insertJobChangeRecord(@RequestBody JobChange record) {
        return jobChangeService.insertJobChangeRecord(record);
    }

    @PostMapping("editJobChange")
    public ResultBean<Void> updateJobChangeRecord(@RequestBody JobChange record) {
        return jobChangeService.updateJobChangeRecord(record);
    }

    @GetMapping("findAllJobChange")
    public ResultBean<List<JobChange>> findAllJobChange() {
        return jobChangeService.findJobChangeRecord();
    }

    @PostMapping("findAllJobChange/{staffId}")
    public ResultBean<List<JobChange>> findAllJobChange(@RequestBody PageInfo pageInfo, @PathVariable Integer staffId) {
        return jobChangeService.findAllJobChangeRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize(), staffId);
    }

    @PostMapping("deleteJobChange")
    public ResultBean<Void> deleteJobChangeRecord(@RequestBody List<Integer> selectMultipleId) {
        return jobChangeService.deleteJobChangeRecord(selectMultipleId);
    }

}