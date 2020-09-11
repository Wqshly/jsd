package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Picture;

import java.util.List;

public interface PictureMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<Picture> selectAll();

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}