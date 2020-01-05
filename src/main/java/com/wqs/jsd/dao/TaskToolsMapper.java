package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.TaskTools;

public interface TaskToolsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskTools record);

    int insertSelective(TaskTools record);

    TaskTools selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskTools record);

    int updateByPrimaryKey(TaskTools record);
}