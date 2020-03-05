package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:53 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface CustomerService {

    ResultBean<Void> insertCustomerRecord(Customer record);

    ResultBean<Void> updateCustomerRecord(Customer record);

    ResultBean<List<Customer>> findCustomerRecord();

    ResultBean<List<Customer>> findAllCustomerRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteCustomerRecord(List<Integer> id);
}