package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderModel;

import java.util.List;

public interface OrderModelMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<OrderModel> selectAll();

    int insert(OrderModel record);

    int insertSelective(OrderModel record);

    OrderModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderModel record);

    int updateByPrimaryKey(OrderModel record);
}