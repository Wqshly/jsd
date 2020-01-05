package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.BasicCoding;

public interface BasicCodingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BasicCoding record);

    int insertSelective(BasicCoding record);

    BasicCoding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BasicCoding record);

    int updateByPrimaryKey(BasicCoding record);
}