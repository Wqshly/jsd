package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CustomerLanding;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:54 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface CustomerLandingService {

    ResultBean<Void> insertCustomerLandingRecord(CustomerLanding record);

    ResultBean<Void> updateCustomerLandingRecord(CustomerLanding record);

    ResultBean<List<CustomerLanding>> findCustomerLandingRecord();

    ResultBean<List<CustomerLanding>> findAllCustomerLandingRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteCustomerLandingRecord(List<Integer> id);
}