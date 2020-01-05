package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.DetailToolsOutIn;

public interface DetailToolsOutInMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetailToolsOutIn record);

    int insertSelective(DetailToolsOutIn record);

    DetailToolsOutIn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetailToolsOutIn record);

    int updateByPrimaryKey(DetailToolsOutIn record);
}