package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.BasicCoding;
import com.wqs.jsd.pojo.Division;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.pojo.Post;
import com.wqs.jsd.service.BasicCodingService;
import com.wqs.jsd.service.DivisionService;
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

    @Autowired
    private DivisionService divisionService;

    @PostMapping("addDivision")
    public ResultBean<Void> addDivisionRecord(@RequestBody Division division) {
        return divisionService.insertDivisionRecord(division);
    }

    @PostMapping("editDivision")
    public ResultBean<Void> updateDivisionRecord(@RequestBody Division division) {
        return divisionService.updateDivisionRecord(division);
    }

    @PostMapping("findAllDivision")
    public ResultBean<List<Division>> findAllDivision(@RequestBody PageInfo pageInfo) {
        return divisionService.findAllDivision(pageInfo.getPage().getNum(),pageInfo.getPage().getSize());
    }

    @PostMapping("deleteDivision")
    public ResultBean<Void> deleteDivision(@RequestBody List<Integer> selectMultipleId) {
        return divisionService.deleteDivision(selectMultipleId);
    }

    @PostMapping("addPost")
    public ResultBean<Void> addPost(@RequestBody Post post) {
        return postService.insertPostRecord(post);
    }

    @PostMapping("editPost")
    public ResultBean<Void> updatePostRecord(@RequestBody Post post) {
        return postService.updatePostRecord(post);
    }

    @PostMapping("findAllPost")
    public ResultBean<List<Post>> findAllPost(@RequestBody PageInfo pageInfo) {
        return postService.findAllPost(pageInfo.getPage().getNum(),pageInfo.getPage().getSize());
    }

    @PostMapping("deletePost")
    public ResultBean<Void> deletePost(@RequestBody List<Integer> selectMultipleId) {
        return postService.deletePost(selectMultipleId);
    }

    @PostMapping("addBasicCoding")
    public ResultBean<Void> addBasicCoding(@RequestBody BasicCoding basicCoding) {
        return basicCodingService.insertBasicCodingRecord(basicCoding);
    }

    @PostMapping("editBasicCoding")
    public ResultBean<Void> updateBasicCoding(@RequestBody BasicCoding basicCoding) {
        return basicCodingService.updateBasicCodingRecord(basicCoding);
    }

    @GetMapping("findBasicCodingWithType/{type}")
    public ResultBean<List<BasicCoding>> findBasicCoding(@PathVariable("type") String type) {
        return basicCodingService.findBasicCodingByType(type);
    }

    @PostMapping("findBasicCodingWithType/{type}")
    public ResultBean<List<BasicCoding>> findBasicCoding(@PathVariable("type") String type, @RequestBody PageInfo pageInfo) {
        return basicCodingService.findBasicCodingByType(type,pageInfo.getPage().getNum(),pageInfo.getPage().getSize());
    }

    @PostMapping("deleteBasicCoding")
    public ResultBean<Void> deleteBasicCoding(@RequestBody List<Integer> selectMultipleId) {
        return basicCodingService.deleteBasicCoding(selectMultipleId);
    }
}
