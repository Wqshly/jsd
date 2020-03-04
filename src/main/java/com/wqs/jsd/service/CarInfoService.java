package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CarInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 9:16 2020/3/4
 * @Description:
 * @Modified By:
 */
@Service
public interface CarInfoService {
    ResultBean<List<CarInfo>> findAllCarInfo(int currentPage, int pageSize);
}
