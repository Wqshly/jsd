package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.ToolsUse;

import java.util.List;

public interface ToolsUseMapper {

    int deleteByPrimaryKey(List<Integer> id);

    int insert(ToolsUse record);

    int insertSelective(ToolsUse record);

    ToolsUse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ToolsUse record);

    int updateByPrimaryKey(ToolsUse record);
}