package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.MemberDiscount;

public interface MemberDiscountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberDiscount record);

    int insertSelective(MemberDiscount record);

    MemberDiscount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberDiscount record);

    int updateByPrimaryKey(MemberDiscount record);
}