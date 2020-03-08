package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 16:40 2019/12/26
 * @Description:
 * @Modified By:
 */

@Service
public interface StaffService {
    Integer staffCount();
    
    /**
     * @description: 
     * @param: s
     * @return: int
     * @author: van
     * @time: 2020/1/12 17:24
     */ 
    ResultBean<Boolean> staffValid(String s);

    ResultBean<List<Staff>> selectStaffAll();

    ResultBean<List<Staff>> selectStaffAll(int currentPage,int pageSize);

    ResultBean<Void> insertStaffRecord(Staff staff);

    ResultBean<Void> updateStaffRecord(Staff staff);
}
