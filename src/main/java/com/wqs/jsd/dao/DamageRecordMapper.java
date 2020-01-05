package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.DamageRecord;

public interface DamageRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DamageRecord record);

    int insertSelective(DamageRecord record);

    DamageRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DamageRecord record);

    int updateByPrimaryKey(DamageRecord record);
}