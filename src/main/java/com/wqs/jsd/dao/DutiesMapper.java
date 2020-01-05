package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Duties;

public interface DutiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Duties record);

    int insertSelective(Duties record);

    Duties selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Duties record);

    int updateByPrimaryKey(Duties record);
}