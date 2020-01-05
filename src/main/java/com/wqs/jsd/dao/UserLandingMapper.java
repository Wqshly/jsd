package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.UserLanding;

public interface UserLandingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLanding record);

    int insertSelective(UserLanding record);

    UserLanding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLanding record);

    int updateByPrimaryKey(UserLanding record);
}