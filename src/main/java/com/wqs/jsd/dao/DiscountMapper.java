package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Discount;

public interface DiscountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Discount record);

    int insertSelective(Discount record);

    Discount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Discount record);

    int updateByPrimaryKey(Discount record);
}