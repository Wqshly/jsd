package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Duties;

import java.util.List;

public interface DutiesMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<Duties> selectAll();

    int insert(Duties record);

    int insertSelective(Duties record);

    Duties selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Duties record);

    int updateByPrimaryKey(Duties record);
}