package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.CustomerAddress;

import java.util.List;

public interface CustomerAddressMapper {

    int countTotal();

    int deleteById(Integer id);

    int deleteByPrimaryKey(List<Integer> id);

    List<CustomerAddress> selectAll();

    int insert(CustomerAddress record);

    int insertSelective(CustomerAddress record);

    CustomerAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAddress record);

    int updateByPrimaryKey(CustomerAddress record);

    List<CustomerAddress> selectAddressByCustomer(int customerId);
}