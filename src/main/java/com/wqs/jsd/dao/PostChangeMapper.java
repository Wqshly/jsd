package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.PostChange;

import java.util.List;

public interface PostChangeMapper {

    int countTotal();

    int countTotalByStaffId(Integer id);

    int deleteByPrimaryKey(List<Integer> id);

    int insert(PostChange record);

    List<PostChange> selectAll();

    List<PostChange> selectByStaffId(Integer id);

    int insertSelective(PostChange record);

    PostChange selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PostChange record);

    int updateByPrimaryKey(PostChange record);
}