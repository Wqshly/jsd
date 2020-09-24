package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Picture;

import java.util.List;

public interface PictureMapper {

    String getPathById(Integer id);

    int countTotal();

    int deleteById(Integer id);

    int deleteByPrimaryKey(List<Integer> id);

    List<Picture> selectAll();

    int findPreRecord(Integer id);

    int findNextRecord(Integer id);

    int exchangeRecord(Integer id1, Integer id2);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}