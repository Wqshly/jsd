package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.DayOff;

public interface DayOffMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DayOff record);

    int insertSelective(DayOff record);

    DayOff selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DayOff record);

    int updateByPrimaryKey(DayOff record);
}