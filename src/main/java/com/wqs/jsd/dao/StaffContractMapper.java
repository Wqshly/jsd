package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.StaffContract;

import java.util.List;

public interface StaffContractMapper {

    int countTotal();

    int countTotalByStaffId(Integer id);

    int deleteByPrimaryKey(List<Integer> id);

    List<StaffContract> selectAll();

    List<StaffContract> selectByStaffId(Integer id);

    int insert(StaffContract record);

    int insertSelective(StaffContract record);

    StaffContract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StaffContract record);

    int updateByPrimaryKey(StaffContract record);
}