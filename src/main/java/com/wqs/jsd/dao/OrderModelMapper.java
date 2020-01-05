package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderModel;

public interface OrderModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderModel record);

    int insertSelective(OrderModel record);

    OrderModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderModel record);

    int updateByPrimaryKey(OrderModel record);
}