package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.OrderRecept;

public interface OrderReceptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderRecept record);

    int insertSelective(OrderRecept record);

    OrderRecept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderRecept record);

    int updateByPrimaryKey(OrderRecept record);
}