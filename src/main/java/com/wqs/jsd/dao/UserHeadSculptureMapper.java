package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.UserHeadSculpture;

import java.util.List;

public interface UserHeadSculptureMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<UserHeadSculpture> selectAll();

    int insert(UserHeadSculpture record);

    int insertSelective(UserHeadSculpture record);

    UserHeadSculpture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserHeadSculpture record);

    int updateByPrimaryKey(UserHeadSculpture record);

    String selectByUserId(int id);
}