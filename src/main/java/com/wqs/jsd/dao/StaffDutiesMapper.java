package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.StaffDuties;

public interface StaffDutiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StaffDuties record);

    int insertSelective(StaffDuties record);

    StaffDuties selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StaffDuties record);

    int updateByPrimaryKey(StaffDuties record);
}