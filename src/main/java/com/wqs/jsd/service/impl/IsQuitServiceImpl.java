package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.IsQuitMapper;
import com.wqs.jsd.pojo.IsQuit;
import com.wqs.jsd.service.IsQuitService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.SUCCESS;
import static com.wqs.jsd.beans.ResultBean.UNKNOWN_EXCEPTION;

/**
 * @Author: wan
 * @Date: Created in 20:13 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class IsQuitServiceImpl implements IsQuitService {

    private static final Logger logger = LoggerFactory.getLogger(IsQuitService.class);

    @Resource
    private IsQuitMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertIsQuitRecord(IsQuit record) {
        record.setFinalEditTime(commonMethod.getTime());
        if (record.getIsQuit().equals("否")) {
            record.setEndTime(null);
        }
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateIsQuitRecord(IsQuit record) {
        if (record.getIsQuit().equals("否")) {
            record.setEndTime(null);
        }
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<IsQuit>> findIsQuitRecord() {
        try {
            List<IsQuit> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<IsQuit>> findAllIsQuitRecord(int currentPage, int pageSize, int id) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<IsQuit> records = mapper.selectByStaffId(id);
            int total = mapper.countTotalByStaffId(id);
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteIsQuitRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}