package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.UserLanding;

import java.util.List;

public interface UserLandingMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<UserLanding> selectAll();

    int insert(UserLanding record);

    int insertSelective(UserLanding record);

    UserLanding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLanding record);

    int updateByPrimaryKey(UserLanding record);
}