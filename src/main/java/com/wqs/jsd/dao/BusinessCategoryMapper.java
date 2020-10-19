package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.BusinessCategory;

import java.util.List;

public interface BusinessCategoryMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<BusinessCategory> selectAll();

    int insert(BusinessCategory record);

    int insertSelective(BusinessCategory record);

    BusinessCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessCategory record);

    int updateByPrimaryKey(BusinessCategory record);

    List<BusinessCategory> selectByClassification(String classification);

    List<String> findName(String classification);

    List<String> findIntroduction(String classification);

    List<String> findPicPath(String classification);
}