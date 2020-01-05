package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderTaskModel;

public interface OrderTaskModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderTaskModel record);

    int insertSelective(OrderTaskModel record);

    OrderTaskModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderTaskModel record);

    int updateByPrimaryKey(OrderTaskModel record);
}