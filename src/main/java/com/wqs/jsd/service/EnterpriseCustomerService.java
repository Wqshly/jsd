package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.EnterpriseCustomer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 16:17 2020/8/9
 * @Description:
 * @Modified By:
 */
@Service
public interface EnterpriseCustomerService {

    ResultBean<Boolean> validPhoneNum(String phoneNum);

    ResultBean<Void> insertEnterpriseCustomerRecord(EnterpriseCustomer record);

    ResultBean<Void> updateEnterpriseCustomerRecord(EnterpriseCustomer record);

    ResultBean<List<EnterpriseCustomer>> findEnterpriseCustomerRecord();

    ResultBean<List<EnterpriseCustomer>> findAllEnterpriseCustomerRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteEnterpriseCustomerRecord(List<Integer> id);
}