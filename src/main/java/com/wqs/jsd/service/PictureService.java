package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Picture;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 11:16 2020/9/11
 * @Description:
 * @Modified By:
 */
@Service
public interface PictureService {

    ResultBean<Void> exchangePreId(Integer id);

    ResultBean<Void> exchangeNextId(Integer id);

    ResultBean<Void> insertPictureRecord(Picture record);

    ResultBean<Void> updatePictureRecord(Picture record);

    ResultBean<List<Picture>> findPictureRecord();

    ResultBean<Integer> picTotalNum();

    ResultBean<List<Picture>> findAllPictureRecord(int currentPage, int pageSize);

    ResultBean<Void> deletePictureRecord(Integer id);

    ResultBean<Void> deletePictureRecord(List<Integer> id);
}