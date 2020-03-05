package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.BillsOutInMapper;
import com.wqs.jsd.pojo.BillsOutIn;
import com.wqs.jsd.service.BillsOutInService;
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
 * @Date: Created in 20:16 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class BillsOutInServiceImpl implements BillsOutInService {

    private static final Logger logger = LoggerFactory.getLogger(BillsOutInService.class);

    @Resource
    private BillsOutInMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertBillsOutInRecord(BillsOutIn record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateBillsOutInRecord(BillsOutIn record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<BillsOutIn>> findBillsOutInRecord() {
        try {
            List<BillsOutIn> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<BillsOutIn>> findAllBillsOutInRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<BillsOutIn> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteBillsOutInRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}