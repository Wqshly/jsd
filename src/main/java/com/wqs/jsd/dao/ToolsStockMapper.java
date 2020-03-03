package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.ToolsStock;

import java.util.List;

public interface ToolsStockMapper {

    int deleteByPrimaryKey(List<Integer> id);

    int insert(ToolsStock record);

    int insertSelective(ToolsStock record);

    ToolsStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ToolsStock record);

    int updateByPrimaryKey(ToolsStock record);
}