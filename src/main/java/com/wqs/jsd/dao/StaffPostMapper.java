package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.StaffPost;

import java.util.List;

public interface StaffPostMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<StaffPost> selectAll();

    int insert(StaffPost record);

    int insertSelective(StaffPost record);

    StaffPost selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StaffPost record);

    int updateByPrimaryKey(StaffPost record);
}