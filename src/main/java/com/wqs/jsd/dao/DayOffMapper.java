package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.DayOff;

import java.util.List;

public interface DayOffMapper {
    int deleteByPrimaryKey(List<Integer> id);

    List<DayOff> selectAll();

    int insert(DayOff record);

    int insertSelective(DayOff record);

    DayOff selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DayOff record);

    int updateByPrimaryKey(DayOff record);
}