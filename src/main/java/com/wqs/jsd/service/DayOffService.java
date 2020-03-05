package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.DayOff;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:54 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface DayOffService {

    ResultBean<Void> insertDayOffRecord(DayOff record);

    ResultBean<Void> updateDayOffRecord(DayOff record);

    ResultBean<List<DayOff>> findDayOffRecord();

    ResultBean<List<DayOff>> findAllDayOffRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteDayOffRecord(List<Integer> id);
}