package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CustomerHeadSculpture;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:53 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface CustomerHeadSculptureService {

    ResultBean<Void> insertCustomerHeadSculptureRecord(CustomerHeadSculpture record);

    ResultBean<Void> updateCustomerHeadSculptureRecord(CustomerHeadSculpture record);

    ResultBean<List<CustomerHeadSculpture>> findCustomerHeadSculptureRecord();

    ResultBean<List<CustomerHeadSculpture>> findAllCustomerHeadSculptureRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteCustomerHeadSculptureRecord(List<Integer> id);
}