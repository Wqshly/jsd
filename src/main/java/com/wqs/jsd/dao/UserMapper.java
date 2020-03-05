package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.User;

import java.util.List;

public interface UserMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<User> selectAll();

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByStaffId(User user);

    int loginByStaffId(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}