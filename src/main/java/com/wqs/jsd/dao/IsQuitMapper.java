package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.IsQuit;

import java.util.List;

public interface IsQuitMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<IsQuit> selectAll();

    int insert(IsQuit record);

    int insertSelective(IsQuit record);

    IsQuit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IsQuit record);

    int updateByPrimaryKey(IsQuit record);
}