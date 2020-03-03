package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CustomerDetail;

import java.util.List;

public interface CustomerDetailMapper {
    int deleteByPrimaryKey(List<Integer> id);

    int insert(CustomerDetail record);

    int insertSelective(CustomerDetail record);

    CustomerDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerDetail record);

    int updateByPrimaryKey(CustomerDetail record);
}