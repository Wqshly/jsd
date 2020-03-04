package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Tools;

import java.util.List;

public interface ToolsMapper {

    int deleteByPrimaryKey(List<Integer> id);

    List<Tools> selectAll();

    int insert(Tools record);

    int insertSelective(Tools record);

    Tools selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tools record);

    int updateByPrimaryKey(Tools record);
}