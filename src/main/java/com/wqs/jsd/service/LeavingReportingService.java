package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.LeavingReporting;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 11:12 2020/4/15
 * @Description:
 * @Modified By:
 */
@Service
public interface LeavingReportingService {

    ResultBean<Void> insertLeavingReportingRecord(LeavingReporting record);

    ResultBean<Void> updateLeavingReportingRecord(LeavingReporting record);

    ResultBean<List<LeavingReporting>> findLeavingReportingRecord();

    ResultBean<List<LeavingReporting>> findAllLeavingReportingRecord(int currentPage, int pageSize, int id);

    ResultBean<Void> deleteLeavingReportingRecord(List<Integer> id);
}