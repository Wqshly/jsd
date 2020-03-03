package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Commissions;

import java.util.List;

public interface CommissionsMapper {
    int deleteByPrimaryKey(List<Integer> id);

    int insert(Commissions record);

    int insertSelective(Commissions record);

    Commissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Commissions record);

    int updateByPrimaryKey(Commissions record);
}