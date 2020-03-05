package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.StaffDuties;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:59 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface StaffDutiesService {

    ResultBean<Void> insertStaffDutiesRecord(StaffDuties record);

    ResultBean<Void> updateStaffDutiesRecord(StaffDuties record);

    ResultBean<List<StaffDuties>> findStaffDutiesRecord();

    ResultBean<List<StaffDuties>> findAllStaffDutiesRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteStaffDutiesRecord(List<Integer> id);
}