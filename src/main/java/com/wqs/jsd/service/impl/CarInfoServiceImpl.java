package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.CarInfoMapper;
import com.wqs.jsd.pojo.CarInfo;
import com.wqs.jsd.service.CarInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.SUCCESS;
import static com.wqs.jsd.beans.ResultBean.UNKNOWN_EXCEPTION;

/**
 * @Author:
 * @Date: Created in 9:19 2020/3/4
 * @Description:
 * @Modified By:
 */
@Service
public class CarInfoServiceImpl implements CarInfoService {

    private static final Logger logger = LoggerFactory.getLogger(CarInfoService.class);

    @Resource
    private CarInfoMapper carInfoMapper;

    @Override
    public ResultBean<List<CarInfo>> findAllCarInfo(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<CarInfo> divisions = carInfoMapper.selectAll();
            return new ResultBean<>(divisions, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<Void>> insertCarInfo(CarInfo carInfo) {
        return null;
    }
}
