package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.IsQuit;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.IsQuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 23:06 2020/3/5
 * @Description:
 * @Modified By:
 */
@RequestMapping("/isQuit")
@RestController
public class IsQuitController {
    @Autowired
    private IsQuitService isQuitService;

    @PostMapping("addIsQuit")
    public ResultBean<Void> insertIsQuitRecord(@RequestBody IsQuit record) {
        return isQuitService.insertIsQuitRecord(record);
    }

    @PostMapping("editIsQuit")
    public ResultBean<Void> updateIsQuitRecord(@RequestBody IsQuit record) {
        return isQuitService.updateIsQuitRecord(record);
    }

    @GetMapping("findAllIsQuit")
    public ResultBean<List<IsQuit>> findAllIsQuit() {
        return isQuitService.findIsQuitRecord();
    }

    @PostMapping("findAllIsQuit/{staffId}")
    public ResultBean<List<IsQuit>> findAllIsQuit(@RequestBody PageInfo pageInfo, @PathVariable Integer staffId) {
        return isQuitService.findAllIsQuitRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize(), staffId);
    }

    @PostMapping("deleteIsQuit")
    public ResultBean<Void> deleteIsQuitRecord(@RequestBody List<Integer> selectMultipleId) {
        return isQuitService.deleteIsQuitRecord(selectMultipleId);
    }

}