package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Duties;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:55 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface DutiesService {

    ResultBean<Void> insertDutiesRecord(Duties record);

    ResultBean<Void> updateDutiesRecord(Duties record);

    ResultBean<List<Duties>> findDutiesRecord();

    ResultBean<List<Duties>> findAllDutiesRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteDutiesRecord(List<Integer> id);
}