package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Article;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 14:47 2020/9/24
 * @Description:
 * @Modified By:
 */
@Service
public interface ArticleService {

    ResultBean<Void> insertArticleRecord(Article record);

    ResultBean<Void> updateArticleRecord(Article record);

    ResultBean<List<Article>> findArticleRecord();

    ResultBean<List<Article>> findAllArticleRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteArticleRecord(List<Integer> id);

    String findArticle(Integer id);

}