package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Authority;

import java.util.List;

public interface AuthorityMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<Authority> selectAll();

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}