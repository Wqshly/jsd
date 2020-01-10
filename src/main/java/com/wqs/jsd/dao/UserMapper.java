package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.StaffUser;
import com.wqs.jsd.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByStaffId(User user);

    int loginByStaffId(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}