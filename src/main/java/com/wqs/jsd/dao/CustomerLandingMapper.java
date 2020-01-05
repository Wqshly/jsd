package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CustomerLanding;

public interface CustomerLandingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerLanding record);

    int insertSelective(CustomerLanding record);

    CustomerLanding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerLanding record);

    int updateByPrimaryKey(CustomerLanding record);
}