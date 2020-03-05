package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Role;

import java.util.List;

public interface RoleMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<Role> selectAll();

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}