package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CarInfo;

import java.util.List;

public interface CarInfoMapper {
    int deleteByPrimaryKey(List<Integer> id);

    List<CarInfo> selectAll();

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    CarInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
}