package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.TaskTools;

import java.util.List;

public interface TaskToolsMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<TaskTools> selectAll();

    int insert(TaskTools record);

    int insertSelective(TaskTools record);

    TaskTools selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskTools record);

    int updateByPrimaryKey(TaskTools record);
}