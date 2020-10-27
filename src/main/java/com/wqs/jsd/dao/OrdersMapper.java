package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Orders;

import java.util.List;

public interface OrdersMapper {

    int countTotal();

    int deleteByPrimaryKey(Integer id);

    int deleteByPrimaryKeys(List<Integer> id);

    List<Orders> selectAll();

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}