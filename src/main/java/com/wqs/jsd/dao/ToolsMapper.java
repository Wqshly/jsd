package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Tools;

public interface ToolsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tools record);

    int insertSelective(Tools record);

    Tools selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tools record);

    int updateByPrimaryKey(Tools record);
}