package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.QualificationManagement;

import java.util.List;

public interface QualificationManagementMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<QualificationManagement> selectAll();

    int insert(QualificationManagement record);

    int insertSelective(QualificationManagement record);

    QualificationManagement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QualificationManagement record);

    int updateByPrimaryKey(QualificationManagement record);
}