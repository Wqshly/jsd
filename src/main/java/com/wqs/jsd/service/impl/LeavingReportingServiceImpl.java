package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.LeavingReportingMapper;
import com.wqs.jsd.pojo.LeavingReporting;
import com.wqs.jsd.service.LeavingReportingService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.SUCCESS;
import static com.wqs.jsd.beans.ResultBean.UNKNOWN_EXCEPTION;

/**
 * @Author: wan
 * @Date: Created in 11:12 2020/4/15
 * @Description:
 * @Modified By:
 */
@Service
public class LeavingReportingServiceImpl implements LeavingReportingService {

    private static final Logger logger = LoggerFactory.getLogger(LeavingReportingService.class);

    @Resource
    private LeavingReportingMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertLeavingReportingRecord(LeavingReporting record) {
        if (record.getIsEnd().equals("否")) {
            record.setEndTime(null);
        }
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateLeavingReportingRecord(LeavingReporting record) {
//        if (record.getIsEnd().equals("否")) {
//            record.setEndTime("- - - -");
//            System.out.println(record.getEndTime());
//        }
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<LeavingReporting>> findLeavingReportingRecord() {
        try {
            List<LeavingReporting> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<LeavingReporting>> findAllLeavingReportingRecord(int currentPage, int pageSize, int id) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<LeavingReporting> records = mapper.selectByStaffId(id);
            int total = mapper.countTotalByStaffId(id);
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteLeavingReportingRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}