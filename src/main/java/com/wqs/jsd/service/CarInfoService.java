package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CarInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 21:04 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface CarInfoService {

    ResultBean<Void> insertCarInfoRecord(CarInfo record);

    ResultBean<Void> updateCarInfoRecord(CarInfo record);

    ResultBean<List<CarInfo>> findCarInfoRecord();

    ResultBean<List<CarInfo>> findAllCarInfoRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteCarInfoRecord(List<Integer> id);
}