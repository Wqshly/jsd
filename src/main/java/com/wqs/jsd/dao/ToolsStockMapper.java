package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.ToolsStock;

public interface ToolsStockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ToolsStock record);

    int insertSelective(ToolsStock record);

    ToolsStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ToolsStock record);

    int updateByPrimaryKey(ToolsStock record);
}