package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.TaskToolUseModel;

public interface TaskToolUseModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskToolUseModel record);

    int insertSelective(TaskToolUseModel record);

    TaskToolUseModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskToolUseModel record);

    int updateByPrimaryKey(TaskToolUseModel record);
}