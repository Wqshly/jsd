package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.DamageRecord;

import java.util.List;

public interface DamageRecordMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<DamageRecord> selectAll();

    int insert(DamageRecord record);

    int insertSelective(DamageRecord record);

    DamageRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DamageRecord record);

    int updateByPrimaryKey(DamageRecord record);
}