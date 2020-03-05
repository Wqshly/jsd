package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.TaskTools;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:00 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface TaskToolsService {

    ResultBean<Void> insertTaskToolsRecord(TaskTools record);

    ResultBean<Void> updateTaskToolsRecord(TaskTools record);

    ResultBean<List<TaskTools>> findTaskToolsRecord();

    ResultBean<List<TaskTools>> findAllTaskToolsRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteTaskToolsRecord(List<Integer> id);
}