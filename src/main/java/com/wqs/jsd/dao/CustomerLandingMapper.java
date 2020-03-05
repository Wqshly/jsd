package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CustomerLanding;

import java.util.List;

public interface CustomerLandingMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<CustomerLanding> selectAll();

    int insert(CustomerLanding record);

    int insertSelective(CustomerLanding record);

    CustomerLanding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerLanding record);

    int updateByPrimaryKey(CustomerLanding record);
}