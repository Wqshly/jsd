package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CompanyCustomerDetail;

import java.util.List;

public interface CompanyCustomerDetailMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<CompanyCustomerDetail> selectAll();

    int insert(CompanyCustomerDetail record);

    int insertSelective(CompanyCustomerDetail record);

    CompanyCustomerDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyCustomerDetail record);

    int updateByPrimaryKey(CompanyCustomerDetail record);
}