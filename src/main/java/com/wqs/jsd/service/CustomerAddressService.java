package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CustomerAddress;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:15 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface CustomerAddressService {

    ResultBean<Void> insertCustomerAddressRecord(CustomerAddress record);

    ResultBean<Void> updateCustomerAddressRecord(CustomerAddress record);

    ResultBean<List<CustomerAddress>> findCustomerAddressRecord();

    ResultBean<List<CustomerAddress>> findAllCustomerAddressRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteAddressRecord(Integer id);

    ResultBean<Void> deleteCustomerAddressRecord(List<Integer> id);

    ResultBean<List<CustomerAddress>> findAddressByCustomer(int id);
}