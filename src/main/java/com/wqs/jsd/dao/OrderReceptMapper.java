package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderRecept;

import java.util.List;

public interface OrderReceptMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<OrderRecept> selectAll();

    int insert(OrderRecept record);

    int insertSelective(OrderRecept record);

    OrderRecept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderRecept record);

    int updateByPrimaryKey(OrderRecept record);
}