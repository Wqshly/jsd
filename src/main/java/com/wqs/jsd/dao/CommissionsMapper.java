package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Commissions;

public interface CommissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Commissions record);

    int insertSelective(Commissions record);

    Commissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Commissions record);

    int updateByPrimaryKey(Commissions record);
}