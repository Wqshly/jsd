package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderTaskModel;

import java.util.List;

public interface OrderTaskModelMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<OrderTaskModel> selectAll();

    int insert(OrderTaskModel record);

    int insertSelective(OrderTaskModel record);

    OrderTaskModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderTaskModel record);

    int updateByPrimaryKey(OrderTaskModel record);
}