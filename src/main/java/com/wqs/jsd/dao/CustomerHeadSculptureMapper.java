package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CustomerHeadSculpture;

import java.util.List;

public interface CustomerHeadSculptureMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<CustomerHeadSculpture> selectAll();

    int insert(CustomerHeadSculpture record);

    int insertSelective(CustomerHeadSculpture record);

    CustomerHeadSculpture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerHeadSculpture record);

    int updateByPrimaryKey(CustomerHeadSculpture record);
}