package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Post;

import java.util.List;

public interface PostMapper {

    int deleteByPrimaryKey(List<Integer> id);

    List<Post> selectAll();

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}