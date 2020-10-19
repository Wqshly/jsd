package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Article;

import java.util.List;

public interface ArticleMapper {
    
    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<Article> selectAll();

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<String> selectAllTitle();

    List<String> selectAllImg();
}