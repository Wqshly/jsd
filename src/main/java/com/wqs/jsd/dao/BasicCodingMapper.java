package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.BasicCoding;

import java.util.List;

public interface BasicCodingMapper {

    int countByType(String s);

    List<BasicCoding> selectByType(String s);

    List<BasicCoding> selectAll();

    int deleteByPrimaryKey(List<Integer> id);

    int insert(BasicCoding record);

    int insertSelective(BasicCoding record);

    BasicCoding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BasicCoding record);

    int updateByPrimaryKey(BasicCoding record);

    int deleteByTypeAndName(String type, String name);

    List<String> selectCodingByType(String type);

    List<Integer> findBusinessCategoryId(String type);

    String findFirstMasterCategoryName(String type);
}