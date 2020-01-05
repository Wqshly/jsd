package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.IsQuit;

public interface IsQuitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IsQuit record);

    int insertSelective(IsQuit record);

    IsQuit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IsQuit record);

    int updateByPrimaryKey(IsQuit record);
}