package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.RewardPunishment;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.RewardPunishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 9:53 2020/4/15
 * @Description:
 * @Modified By:
 */
@RequestMapping("/rewardPunishment")
@RestController
public class RewardPunishmentController {
    @Autowired
    private RewardPunishmentService rewardPunishmentService;

    @PostMapping("addRewardPunishment")
    public ResultBean<Void> insertRewardPunishmentRecord(@RequestBody RewardPunishment record) {
        return rewardPunishmentService.insertRewardPunishmentRecord(record);
    }

    @PostMapping("editRewardPunishment")
    public ResultBean<Void> updateRewardPunishmentRecord(@RequestBody RewardPunishment record) {
        return rewardPunishmentService.updateRewardPunishmentRecord(record);
    }

    @GetMapping("findAllRewardPunishment")
    public ResultBean<List<RewardPunishment>> findAllRewardPunishment() {
        return rewardPunishmentService.findRewardPunishmentRecord();
    }

    @PostMapping("findAllRewardPunishment/{staffId}")
    public ResultBean<List<RewardPunishment>> findAllRewardPunishment(@RequestBody PageInfo pageInfo, @PathVariable Integer staffId) {
        return rewardPunishmentService.findAllRewardPunishmentRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize(), staffId);
    }

    @PostMapping("deleteRewardPunishment")
    public ResultBean<Void> deleteRewardPunishmentRecord(@RequestBody List<Integer> selectMultipleId) {
        return rewardPunishmentService.deleteRewardPunishmentRecord(selectMultipleId);
    }

}