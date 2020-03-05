package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.IsQuit;

import java.util.List;

public interface IsQuitMapper {

    int countTotal();

    int countTotalByStaffId(Integer id);

    int deleteByPrimaryKey(List<Integer> id);

    List<IsQuit> selectAll();

    List<IsQuit> selectByStaffId(Integer id);

    int insert(IsQuit record);

    int insertSelective(IsQuit record);

    IsQuit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IsQuit record);

    int updateByPrimaryKey(IsQuit record);
}