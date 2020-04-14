package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.JobChange;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 21:43 2020/4/14
 * @Description:
 * @Modified By:
 */
@Service
public interface JobChangeService {

    ResultBean<Void> insertJobChangeRecord(JobChange record);

    ResultBean<Void> updateJobChangeRecord(JobChange record);

    ResultBean<List<JobChange>> findJobChangeRecord();

    ResultBean<List<JobChange>> findAllJobChangeRecord(int currentPage, int pageSize, int id);

    ResultBean<Void> deleteJobChangeRecord(List<Integer> id);
}