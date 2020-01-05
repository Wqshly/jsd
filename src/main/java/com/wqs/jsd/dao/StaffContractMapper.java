package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.StaffContract;

public interface StaffContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StaffContract record);

    int insertSelective(StaffContract record);

    StaffContract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StaffContract record);

    int updateByPrimaryKey(StaffContract record);
}