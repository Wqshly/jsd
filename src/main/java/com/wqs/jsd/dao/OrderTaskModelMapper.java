package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderTaskModel;

import java.util.List;

public interface OrderTaskModelMapper {

    int deleteByPrimaryKey(List<Integer> id);

    int insert(OrderTaskModel record);

    int insertSelective(OrderTaskModel record);

    OrderTaskModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderTaskModel record);

    int updateByPrimaryKey(OrderTaskModel record);
}