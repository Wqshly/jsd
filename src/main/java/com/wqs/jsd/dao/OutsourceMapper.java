package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Outsource;

public interface OutsourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Outsource record);

    int insertSelective(Outsource record);

    Outsource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Outsource record);

    int updateByPrimaryKey(Outsource record);
}