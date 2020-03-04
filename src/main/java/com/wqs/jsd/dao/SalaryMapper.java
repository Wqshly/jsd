package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Salary;

import java.util.List;

public interface SalaryMapper {

    int deleteByPrimaryKey(List<Integer> id);

    List<Salary> selectAll();

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}