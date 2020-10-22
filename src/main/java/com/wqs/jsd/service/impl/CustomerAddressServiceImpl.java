package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.CustomerAddressMapper;
import com.wqs.jsd.pojo.CustomerAddress;
import com.wqs.jsd.service.CustomerAddressService;
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
 * @Date: Created in 20:15 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class CustomerAddressServiceImpl implements CustomerAddressService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerAddressService.class);

    @Resource
    private CustomerAddressMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertCustomerAddressRecord(CustomerAddress record) {
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateCustomerAddressRecord(CustomerAddress record) {
        System.out.println(record.getId());
        System.out.println(record.getAddressName());
        System.out.println(record.getCustomerId());
        System.out.println(record.getCustomerName());
        System.out.println(record.getCustomerPhone());
        System.out.println(record.getDetailAddress());
        System.out.println(record.getIsDefaultAddress());
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<CustomerAddress>> findCustomerAddressRecord() {
        try {
            List<CustomerAddress> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<CustomerAddress>> findAllCustomerAddressRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<CustomerAddress> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteAddressRecord(Integer id) {
        return commonMethod.changeRecord(mapper.deleteById(id));
    }

    @Override
    public ResultBean<Void> deleteCustomerAddressRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public ResultBean<List<CustomerAddress>> findAddressByCustomer(int id) {
        try {
            List<CustomerAddress> records = mapper.selectAddressByCustomer(id);
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }
}