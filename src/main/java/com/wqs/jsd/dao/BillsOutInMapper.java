package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.BillsOutIn;

import java.util.List;

public interface BillsOutInMapper {
    int deleteByPrimaryKey(List<Integer> id);

    int insert(BillsOutIn record);

    int insertSelective(BillsOutIn record);

    BillsOutIn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BillsOutIn record);

    int updateByPrimaryKey(BillsOutIn record);
}