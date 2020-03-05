package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Task;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:00 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface TaskService {

    ResultBean<Void> insertTaskRecord(Task record);

    ResultBean<Void> updateTaskRecord(Task record);

    ResultBean<List<Task>> findTaskRecord();

    ResultBean<List<Task>> findAllTaskRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteTaskRecord(List<Integer> id);
}