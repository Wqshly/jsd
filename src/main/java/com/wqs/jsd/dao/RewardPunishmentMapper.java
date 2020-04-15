package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.RewardPunishment;

import java.util.List;

public interface RewardPunishmentMapper {

    int countTotal();

    int countTotalByStaffId(Integer id);

    int deleteByPrimaryKey(List<Integer> id);

    List<RewardPunishment> selectAll();

    List<RewardPunishment> selectByStaffId(Integer id);

    int insert(RewardPunishment record);

    int insertSelective(RewardPunishment record);

    RewardPunishment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RewardPunishment record);

    int updateByPrimaryKey(RewardPunishment record);
}