package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.BillsOfEntryMapper;
import com.wqs.jsd.pojo.BillsOfEntry;
import com.wqs.jsd.service.BillsOfEntryService;
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
 * @Date: Created in 20:17 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class BillsOfEntryServiceImpl implements BillsOfEntryService {

    private static final Logger logger = LoggerFactory.getLogger(BillsOfEntryService.class);

    @Resource
    private BillsOfEntryMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertBillsOfEntryRecord(BillsOfEntry record) {
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateBillsOfEntryRecord(BillsOfEntry record) {
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<BillsOfEntry>> findBillsOfEntryRecord() {
        try {
            List<BillsOfEntry> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<BillsOfEntry>> findAllBillsOfEntryRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<BillsOfEntry> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteBillsOfEntryRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}