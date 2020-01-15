package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.BasicCoding;
import com.wqs.jsd.pojo.Post;
import com.wqs.jsd.service.BasicCodingService;
import com.wqs.jsd.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 21:52 2020/1/11
 * @Description:
 * @Modified By:
 */
@RequestMapping("/basicCoding")
@RestController
public class BasicCodingController {
    @Autowired
    private BasicCodingService basicCodingService;

    @Autowired
    private PostService postService;

    @PostMapping("addPost")
    public ResultBean<Void> addPost(@RequestBody Post post) {
        return postService.insertPostRecord(post);
    }

    @PostMapping("editPost")
    public ResultBean<Void> updatePostRecord(@RequestBody Post post) {
        return postService.updatePostRecord(post);
    }

    @GetMapping("findAllPost")
    public ResultBean<List<Post>> findAllPost() {
        return postService.findAllPost();
    }

    @PostMapping("deletePost")
    public ResultBean<Void> deletePost(@RequestBody List<Integer> selectMultipleId) {
        return postService.deletePost(selectMultipleId);
    }

    @PostMapping("addBasicCoding")
    public ResultBean<Void> addBasicCoding(@RequestBody BasicCoding basicCoding) {
        return basicCodingService.insertBasicCodingRecord(basicCoding);
    }

    @GetMapping("findBasicCodingWithType")
    public ResultBean<List<BasicCoding>> findBasicCoding(String s) {
        return basicCodingService.findBasicCodingByType(s);
    }
}
