package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Article;
import com.wqs.jsd.pojo.ImageFile;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.ArticleService;
import com.wqs.jsd.util.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 14:45 2020/9/24
 * @Description:
 * @Modified By:
 */
@RequestMapping("/article")
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommonMethod commonMethod;


    @PostMapping("uploadPicture")
    public ResultBean<String> UploadImage(@RequestBody ImageFile imageFile) {
        return commonMethod.UploadImage(imageFile.getName(), imageFile.getFile(), "app\\articleThumbnail");
    }

    @PostMapping("addArticle")
    public ResultBean<Void> insertArticleRecord(@RequestBody Article record) {
        return articleService.insertArticleRecord(record);
    }

    @PostMapping("editArticle")
    public ResultBean<Void> updateArticleRecord(@RequestBody Article record) {
        return articleService.updateArticleRecord(record);
    }

    @GetMapping("findAllArticle")
    public ResultBean<List<Article>> findAllArticle() {
        return articleService.findArticleRecord();
    }

    @GetMapping("findAllArticleTitle")
    public ResultBean<List<String>> findAllArticleTitle() {
        return articleService.findArticleTitleRecord();
    }

    @GetMapping("findAllArticleImg")
    public ResultBean<List<String>> findAllArticleImg() {
        return articleService.findArticleImgRecord();
    }

    @GetMapping("findAllArticleIntroduction")
    public ResultBean<List<String>> findAllArticleIntroduction() {
        return articleService.findArticleIntroductionRecord();
    }

    @GetMapping("findAllArticleAuthor")
    public ResultBean<List<String>> findAllArticleAuthor() {
        return articleService.findArticleAuthorRecord();
    }

    @PostMapping("findAllArticle")
    public ResultBean<List<Article>> findAllArticle(@RequestBody PageInfo pageInfo) {
        return articleService.findAllArticleRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @GetMapping("findArticle/{id}")
    public ResultBean<String> findArticle(@PathVariable("id") Integer id) {
        return articleService.findArticle(id);
    }

    @PostMapping("deleteArticle")
    public ResultBean<Void> deleteArticleRecord(@RequestBody List<Integer> selectMultipleId) {
        return articleService.deleteArticleRecord(selectMultipleId);
    }

}