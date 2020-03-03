package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Discount;

import java.util.List;

public interface DiscountMapper {
    int deleteByPrimaryKey(List<Integer> id);

    int insert(Discount record);

    int insertSelective(Discount record);

    Discount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Discount record);

    int updateByPrimaryKey(Discount record);
}