package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Customer;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(List<Integer> id);

    List<Customer> selectAll();

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}