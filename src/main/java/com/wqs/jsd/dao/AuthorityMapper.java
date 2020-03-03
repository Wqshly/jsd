package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Authority;

import java.util.List;

public interface AuthorityMapper {

    int deleteByPrimaryKey(List<Integer> id);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}