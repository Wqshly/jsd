package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderDetails;

import java.util.List;

public interface OrderDetailsMapper {

    int countTotal();

    int deleteByPrimaryKey(Integer id);

    int deleteByPrimaryKeys(List<Integer> id);

    List<OrderDetails> selectAll();

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    OrderDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);

    OrderDetails findOrderDetailByOrderId(int ordersId);
}