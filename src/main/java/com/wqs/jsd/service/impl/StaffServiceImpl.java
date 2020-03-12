package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.StaffMapper;
import com.wqs.jsd.pojo.Staff;
import com.wqs.jsd.service.StaffService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

import static com.wqs.jsd.beans.ResultBean.*;

/**
 * @Author:
 * @Date: Created in 16:43 2019/12/26
 * @Description:
 * @Modified By:
 */
@Service
public class StaffServiceImpl implements StaffService {

    private static final Logger logger = LoggerFactory.getLogger(StaffService.class);

    @Resource
    private StaffMapper staffMapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public Integer staffCount() {
        return staffMapper.countStaff();
    }

    @Override
    public ResultBean<List<Staff>> selectStaffAll() {
        try {
            List<Staff> staff = staffMapper.selectAll();
            return new ResultBean<>(staff, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<Staff>> selectStaffAll(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<Staff> staff = staffMapper.selectAll();
            int total = staffMapper.countTotal();
            return new ResultBean<>(staff, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> insertStaffRecord(Staff staff) {
        staff.setFinalEditTime(commonMethod.getTime());
        if (staff.getRadio().equals("1")) {
            staff.setNumber("JWC" + CodeUtil.createCode());
        }
        return commonMethod.changeRecord(staffMapper.insert(staff));
    }

    @Override
    public ResultBean<Void> updateStaffRecord(Staff staff) {
        staff.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(staffMapper.updateByPrimaryKey(staff));
    }

    @Override
    public ResultBean<Void> deleteStaffRecord(List<Integer> id) {
        return commonMethod.changeRecord(staffMapper.deleteByPrimaryKey(id));
    }
}
