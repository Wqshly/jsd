package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Warehouse;

import java.util.List;

public interface WarehouseMapper {

    int deleteByPrimaryKey(List<Integer> id);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}