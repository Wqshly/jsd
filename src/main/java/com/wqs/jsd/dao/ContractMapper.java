package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Contract;

import java.util.List;

public interface ContractMapper {
    int deleteByPrimaryKey(List<Integer> id);

    List<Contract> selectAll();

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}