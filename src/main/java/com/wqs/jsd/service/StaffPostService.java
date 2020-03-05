package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.StaffPost;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:59 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface StaffPostService {

    ResultBean<Void> insertStaffPostRecord(StaffPost record);

    ResultBean<Void> updateStaffPostRecord(StaffPost record);

    ResultBean<List<StaffPost>> findStaffPostRecord();

    ResultBean<List<StaffPost>> findAllStaffPostRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteStaffPostRecord(List<Integer> id);
}