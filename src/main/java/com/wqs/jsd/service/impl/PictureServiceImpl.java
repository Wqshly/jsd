package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.PictureMapper;
import com.wqs.jsd.pojo.Picture;
import com.wqs.jsd.service.PictureService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.*;

/**
 * @Author: wan
 * @Date: Created in 11:16 2020/9/11
 * @Description:
 * @Modified By:
 */
@Service
public class PictureServiceImpl implements PictureService {

    private static final Logger logger = LoggerFactory.getLogger(PictureService.class);

    @Resource
    private PictureMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> exchangePreId(Integer id) {
        try {
            return mapper.exchangeRecord(id, mapper.findPreRecord(id)) > 0 ? new ResultBean<>(SUCCESS, "完成交换") : new ResultBean<>(FAILURE, "交换失败");
        } catch (Exception e) {
            return new ResultBean<>(BOUNDS_DOWN, "越下/前界");
        }
    }

    @Override
    public ResultBean<Void> exchangeNextId(Integer id) {
        try {
            return mapper.exchangeRecord(id, mapper.findNextRecord(id)) > 0 ? new ResultBean<>(SUCCESS, "完成交换") : new ResultBean<>(FAILURE, "交换失败");
        } catch (Exception e) {
            return new ResultBean<>(BOUNDS_UP, "越上/后界");
        }
    }

    @Override
    public ResultBean<Void> insertPictureRecord(Picture record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updatePictureRecord(Picture record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<Picture>> findPictureRecord() {
        try {
            List<Picture> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Integer> picTotalNum() {
        try {
            return new ResultBean<>(mapper.countTotal());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<Picture>> findAllPictureRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<Picture> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deletePictureRecord(Integer id) {
        try {
            String path = mapper.getPathById(id);
            boolean delete_flag = true;
            if (path.contains("http://39.107.49.176:8080")) {
                int i = path.indexOf('\\');
                String s = path.substring(i);
                String realPath = "C:\\jsdData" + s;
                delete_flag = commonMethod.deleteFile(realPath);
            }
            return delete_flag ? commonMethod.changeRecord(mapper.deleteById(id)) : new ResultBean<>(DELETE_FAILED, "未能成功删除图片!");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deletePictureRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}