package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Division;

import java.util.List;

public interface DivisionMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<Division> selectAll();

    int insert(Division record);

    int insertSelective(Division record);

    Division selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Division record);

    int updateByPrimaryKey(Division record);
}