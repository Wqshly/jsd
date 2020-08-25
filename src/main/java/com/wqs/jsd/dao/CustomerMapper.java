package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Customer;

import java.util.List;

public interface CustomerMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<Customer> selectAll();

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    String validPhoneNum(String phoneNum);

    int login4Phone(String phone, String password);

    int checkPhoneNum(String phone);

    Customer selectByPhone(String phone);
}