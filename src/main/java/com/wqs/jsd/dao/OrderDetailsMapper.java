package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderDetails;

public interface OrderDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    OrderDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);
}