package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.TaskToolUseModel;

import java.util.List;

public interface TaskToolUseModelMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<TaskToolUseModel> selectAll();

    int insert(TaskToolUseModel record);

    int insertSelective(TaskToolUseModel record);

    TaskToolUseModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskToolUseModel record);

    int updateByPrimaryKey(TaskToolUseModel record);
}