package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Supplier;

import java.util.List;

public interface SupplierMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<Supplier> selectAll();

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}