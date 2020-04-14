package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.PostChange;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.PostChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 18:51 2020/4/14
 * @Description:
 * @Modified By:
 */
@RequestMapping("/")
@RestController
public class PostChangeController {
    @Autowired
    private PostChangeService postChangeService;

    @PostMapping("addPostChange")
    public ResultBean<Void> insertPostChangeRecord(@RequestBody PostChange record) {
        return postChangeService.insertPostChangeRecord(record);
    }

    @PostMapping("editPostChange")
    public ResultBean<Void> updatePostChangeRecord(@RequestBody PostChange record) {
        return postChangeService.updatePostChangeRecord(record);
    }

    @GetMapping("findAllPostChange")
    public ResultBean<List<PostChange>> findAllPostChange() {
        return postChangeService.findPostChangeRecord();
    }

    @PostMapping("findAllPostChange")
    public ResultBean<List<PostChange>> findAllPostChange(@RequestBody PageInfo pageInfo) {
        return postChangeService.findAllPostChangeRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deletePostChange")
    public ResultBean<Void> deletePostChangeRecord(@RequestBody List<Integer> selectMultipleId) {
        return postChangeService.deletePostChangeRecord(selectMultipleId);
    }

}