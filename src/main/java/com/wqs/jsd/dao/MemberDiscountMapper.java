package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.MemberDiscount;

import java.util.List;

public interface MemberDiscountMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<MemberDiscount> selectAll();

    int insert(MemberDiscount record);

    int insertSelective(MemberDiscount record);

    MemberDiscount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberDiscount record);

    int updateByPrimaryKey(MemberDiscount record);
}