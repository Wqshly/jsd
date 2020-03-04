package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.UserRole;

import java.util.List;

public interface UserRoleMapper {

    int deleteByPrimaryKey(List<Integer> id);

    List<UserRole> selectAll();

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}