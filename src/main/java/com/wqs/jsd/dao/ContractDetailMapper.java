package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.ContractDetail;

import java.util.List;

public interface ContractDetailMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<ContractDetail> selectAll();

    int insert(ContractDetail record);

    int insertSelective(ContractDetail record);

    ContractDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContractDetail record);

    int updateByPrimaryKey(ContractDetail record);
}