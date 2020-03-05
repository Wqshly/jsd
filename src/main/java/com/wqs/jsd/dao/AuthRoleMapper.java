package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.AuthRole;

import java.util.List;

public interface AuthRoleMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<AuthRole> selectAll();

    int insert(AuthRole record);

    int insertSelective(AuthRole record);

    AuthRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKey(AuthRole record);
}