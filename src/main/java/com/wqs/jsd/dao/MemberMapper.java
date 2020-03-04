package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Member;

import java.util.List;

public interface MemberMapper {

    int deleteByPrimaryKey(List<Integer> id);

    List<Member> selectAll();

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}