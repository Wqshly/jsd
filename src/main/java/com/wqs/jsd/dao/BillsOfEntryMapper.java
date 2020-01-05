package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.BillsOfEntry;

public interface BillsOfEntryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BillsOfEntry record);

    int insertSelective(BillsOfEntry record);

    BillsOfEntry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BillsOfEntry record);

    int updateByPrimaryKey(BillsOfEntry record);
}