package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CustomerDetail;

import java.util.List;

public interface CustomerDetailMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<CustomerDetail> selectAll();

    int insert(CustomerDetail record);

    int insertSelective(CustomerDetail record);

    CustomerDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerDetail record);

    int updateByPrimaryKey(CustomerDetail record);
}