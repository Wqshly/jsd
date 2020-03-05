package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CustomerDetail;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:53 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface CustomerDetailService {

    ResultBean<Void> insertCustomerDetailRecord(CustomerDetail record);

    ResultBean<Void> updateCustomerDetailRecord(CustomerDetail record);

    ResultBean<List<CustomerDetail>> findCustomerDetailRecord();

    ResultBean<List<CustomerDetail>> findAllCustomerDetailRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteCustomerDetailRecord(List<Integer> id);
}