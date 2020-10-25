package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.BusinessCategory;
import com.wqs.jsd.pojo.ImageFile;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.BusinessCategoryService;
import com.wqs.jsd.util.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 21:46 2020/10/15
 * @Description:
 * @Modified By:
 */
@RequestMapping("/businessCategory")
@RestController
public class BusinessCategoryController {

    @Autowired
    private BusinessCategoryService businessCategoryService;

    @Autowired
    private CommonMethod commonMethod;

    @PostMapping("uploadPicture")
    public ResultBean<String> UploadImage(@RequestBody ImageFile imageFile) {
        return commonMethod.UploadImage(imageFile.getName(), imageFile.getFile(), "app\\businessCategory");
    }

    @PostMapping("addBusinessCategory")
    public ResultBean<Void> insertBusinessCategoryRecord(@RequestBody BusinessCategory record) {
        return businessCategoryService.insertBusinessCategoryRecord(record);
    }

    @PostMapping("editBusinessCategory")
    public ResultBean<Void> updateBusinessCategoryRecord(@RequestBody BusinessCategory record) {
        return businessCategoryService.updateBusinessCategoryRecord(record);
    }

    @GetMapping("findAllBusinessCategory")
    public ResultBean<List<BusinessCategory>> findAllBusinessCategory() {
        return businessCategoryService.findBusinessCategoryRecord();
    }

    @GetMapping("findCategoryByClass/{classification}")
    public ResultBean<List<BusinessCategory>> findCategoryByClass(@PathVariable("classification") String classification) {
        return businessCategoryService.findCategoryByClassRecord(classification);
    }

    @PostMapping("findAllBusinessCategory")
    public ResultBean<List<BusinessCategory>> findAllBusinessCategory(@RequestBody PageInfo pageInfo) {
        return businessCategoryService.findAllBusinessCategoryRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteBusinessCategory")
    public ResultBean<Void> deleteBusinessCategoryRecord(@RequestBody List<Integer> selectMultipleId) {
        return businessCategoryService.deleteBusinessCategoryRecord(selectMultipleId);
    }

}