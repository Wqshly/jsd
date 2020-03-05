package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.StaffContract;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:59 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface StaffContractService {

    ResultBean<Void> insertStaffContractRecord(StaffContract record);

    ResultBean<Void> updateStaffContractRecord(StaffContract record);

    ResultBean<List<StaffContract>> findStaffContractRecord();

    ResultBean<List<StaffContract>> findAllStaffContractRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteStaffContractRecord(List<Integer> id);
}