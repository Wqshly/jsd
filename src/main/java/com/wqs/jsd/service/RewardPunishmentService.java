package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.RewardPunishment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:58 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface RewardPunishmentService {

    ResultBean<Void> insertRewardPunishmentRecord(RewardPunishment record);

    ResultBean<Void> updateRewardPunishmentRecord(RewardPunishment record);

    ResultBean<List<RewardPunishment>> findRewardPunishmentRecord();

    ResultBean<List<RewardPunishment>> findAllRewardPunishmentRecord(int currentPage, int pageSize, int id);

    ResultBean<Void> deleteRewardPunishmentRecord(List<Integer> id);
}