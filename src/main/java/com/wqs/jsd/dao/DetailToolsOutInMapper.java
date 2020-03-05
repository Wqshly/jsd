package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.DetailToolsOutIn;

import java.util.List;

public interface DetailToolsOutInMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<DetailToolsOutIn> selectAll();

    int insert(DetailToolsOutIn record);

    int insertSelective(DetailToolsOutIn record);

    DetailToolsOutIn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetailToolsOutIn record);

    int updateByPrimaryKey(DetailToolsOutIn record);
}