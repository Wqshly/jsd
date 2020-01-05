package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.RewardPunishment;

public interface RewardPunishmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RewardPunishment record);

    int insertSelective(RewardPunishment record);

    RewardPunishment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RewardPunishment record);

    int updateByPrimaryKey(RewardPunishment record);
}