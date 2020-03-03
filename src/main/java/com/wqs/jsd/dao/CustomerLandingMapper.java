package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CustomerLanding;

import java.util.List;

public interface CustomerLandingMapper {
    int deleteByPrimaryKey(List<Integer> id);

    int insert(CustomerLanding record);

    int insertSelective(CustomerLanding record);

    CustomerLanding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerLanding record);

    int updateByPrimaryKey(CustomerLanding record);
}