package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Task;

import java.util.List;

public interface TaskMapper {

    int deleteByPrimaryKey(List<Integer> id);

    List<Task> selectAll();

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}