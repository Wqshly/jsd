package com.wqs.jsd.service.impl;

import com.wqs.jsd.dao.StaffMapper;
import com.wqs.jsd.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:
 * @Date: Created in 16:43 2019/12/26
 * @Description:
 * @Modified By:
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffMapper staffMapper;

    @Override
    public Integer staffCount() {
        return staffMapper.countStaff();
    }
}
