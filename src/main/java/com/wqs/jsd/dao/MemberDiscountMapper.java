package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.MemberDiscount;

import java.util.List;

public interface MemberDiscountMapper {

    int deleteByPrimaryKey(List<Integer> id);

    int insert(MemberDiscount record);

    int insertSelective(MemberDiscount record);

    MemberDiscount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberDiscount record);

    int updateByPrimaryKey(MemberDiscount record);
}