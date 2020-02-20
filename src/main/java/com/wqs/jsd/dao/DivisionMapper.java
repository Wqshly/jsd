package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Division;

import java.util.List;

public interface DivisionMapper {

    List<Division> selectAll();

    int deleteByPrimaryKey(List<Integer> id);

    int insert(Division record);

    int insertSelective(Division record);

    Division selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Division record);

    int updateByPrimaryKey(Division record);
}