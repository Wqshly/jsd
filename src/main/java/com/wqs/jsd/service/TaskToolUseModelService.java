package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.TaskToolUseModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:00 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface TaskToolUseModelService {

    ResultBean<Void> insertTaskToolUseModelRecord(TaskToolUseModel record);

    ResultBean<Void> updateTaskToolUseModelRecord(TaskToolUseModel record);

    ResultBean<List<TaskToolUseModel>> findTaskToolUseModelRecord();

    ResultBean<List<TaskToolUseModel>> findAllTaskToolUseModelRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteTaskToolUseModelRecord(List<Integer> id);
}