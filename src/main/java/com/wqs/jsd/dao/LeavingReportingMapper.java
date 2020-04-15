package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.LeavingReporting;

import java.util.List;

public interface LeavingReportingMapper {

    int countTotal();

    int countTotalByStaffId(Integer id);

    int deleteByPrimaryKey(List<Integer> id);

    List<LeavingReporting> selectAll();

    List<LeavingReporting> selectByStaffId(Integer id);

    int insert(LeavingReporting record);

    int insertSelective(LeavingReporting record);

    LeavingReporting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeavingReporting record);

    int updateByPrimaryKey(LeavingReporting record);
}