package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.ImageFile;
import com.wqs.jsd.pojo.Picture;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.PictureService;
import com.wqs.jsd.util.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 10:37 2020/9/11
 * @Description:
 * @Modified By:
 */
@RequestMapping("/picture")
@RestController
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @Autowired
    private CommonMethod commonMethod;

    @PostMapping("uploadPicture")
    public ResultBean<String> UploadImage(@RequestBody ImageFile imageFile) {
        return commonMethod.UploadImage(imageFile.getName(), imageFile.getFile(), "app\\carouselImage");
    }

    @PostMapping("addPicture")
    public ResultBean<Void> insertPictureRecord(@RequestBody Picture record) {
        return pictureService.insertPictureRecord(record);
    }

    @PostMapping("editPicture")
    public ResultBean<Void> updatePictureRecord(@RequestBody Picture record) {
        return pictureService.updatePictureRecord(record);
    }

    @GetMapping("picTotalNum")
    public ResultBean<Integer> picTotalNum() {
        return pictureService.picTotalNum();
    }

    @GetMapping("findAllPicture")
    public ResultBean<List<Picture>> findAllPicture() {
        return pictureService.findPictureRecord();
    }

    @PostMapping("findAllPicture")
    public ResultBean<List<Picture>> findAllPicture(@RequestBody PageInfo pageInfo) {
        return pictureService.findAllPictureRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @GetMapping("deletePicture/{id}")
    public ResultBean<Void> deletePictureRecord(@PathVariable Integer id) {
        return pictureService.deletePictureRecord(id);
    }

    @PostMapping("deletePicture1")
    public ResultBean<Void> deletePictureRecord(@RequestBody List<Integer> selectMultipleId) {
        return pictureService.deletePictureRecord(selectMultipleId);
    }

}