package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.StaffPost;

public interface StaffPostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StaffPost record);

    int insertSelective(StaffPost record);

    StaffPost selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StaffPost record);

    int updateByPrimaryKey(StaffPost record);
}