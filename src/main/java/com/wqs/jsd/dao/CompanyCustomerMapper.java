package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CompanyCustomer;

import java.util.List;

public interface CompanyCustomerMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<CompanyCustomer> selectAll();

    int insert(CompanyCustomer record);

    int insertSelective(CompanyCustomer record);

    CompanyCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyCustomer record);

    int updateByPrimaryKey(CompanyCustomer record);
}