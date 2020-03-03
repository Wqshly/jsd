package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.StaffDuties;

import java.util.List;

public interface StaffDutiesMapper {

    int deleteByPrimaryKey(List<Integer> id);

    int insert(StaffDuties record);

    int insertSelective(StaffDuties record);

    StaffDuties selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StaffDuties record);

    int updateByPrimaryKey(StaffDuties record);
}