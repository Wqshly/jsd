package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.RewardPunishment;

import java.util.List;

public interface RewardPunishmentMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<RewardPunishment> selectAll();

    int insert(RewardPunishment record);

    int insertSelective(RewardPunishment record);

    RewardPunishment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RewardPunishment record);

    int updateByPrimaryKey(RewardPunishment record);
}