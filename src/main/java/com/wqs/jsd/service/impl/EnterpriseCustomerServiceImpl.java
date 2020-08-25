package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.EnterpriseCustomerMapper;
import com.wqs.jsd.pojo.EnterpriseCustomer;
import com.wqs.jsd.service.EnterpriseCustomerService;
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
 * @Author: wan
 * @Date: Created in 16:17 2020/8/9
 * @Description:
 * @Modified By:
 */
@Service
public class EnterpriseCustomerServiceImpl implements EnterpriseCustomerService {

    private static final Logger logger = LoggerFactory.getLogger(EnterpriseCustomerService.class);

    @Resource
    private EnterpriseCustomerMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Boolean> validPhoneNum(String phoneNum) {
        return CommonMethod.validPhoneNum(mapper.validPhoneNum(phoneNum));
    }

    @Override
    public ResultBean<Void> insertEnterpriseCustomerRecord(EnterpriseCustomer record) {
        record.setFinalEditTime(commonMethod.getTime());
        record.setPassword(record.getContactPhoneNumber());
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateEnterpriseCustomerRecord(EnterpriseCustomer record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<EnterpriseCustomer>> findEnterpriseCustomerRecord() {
        try {
            List<EnterpriseCustomer> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<EnterpriseCustomer>> findAllEnterpriseCustomerRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<EnterpriseCustomer> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteEnterpriseCustomerRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}