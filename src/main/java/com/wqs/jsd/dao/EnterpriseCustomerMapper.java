package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.EnterpriseCustomer;

import java.util.List;

public interface EnterpriseCustomerMapper {
    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<EnterpriseCustomer> selectAll();

    int insert(EnterpriseCustomer record);

    int insertSelective(EnterpriseCustomer record);

    EnterpriseCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EnterpriseCustomer record);

    int updateByPrimaryKey(EnterpriseCustomer record);

    String validPhoneNum(String phoneNum);
}