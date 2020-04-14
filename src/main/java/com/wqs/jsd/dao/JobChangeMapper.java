package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.JobChange;

import java.util.List;

public interface JobChangeMapper {

    int countTotal();

    int countTotalByStaffId(Integer id);

    int deleteByPrimaryKey(List<Integer> id);

    List<JobChange> selectAll();

    List<JobChange> selectByStaffId(Integer id);

    int insert(JobChange record);

    int insertSelective(JobChange record);

    JobChange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobChange record);

    int updateByPrimaryKey(JobChange record);
}