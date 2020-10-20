package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CustomerAddress;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.CustomerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 17:10 2020/10/20
 * @Description:
 * @Modified By:
 */
@RequestMapping("/customerAddress")
@RestController
public class CustomerAddressController {
    @Autowired
    private CustomerAddressService customerAddressService;

    @PostMapping("addCustomerAddress")
    public ResultBean<Void> insertCustomerAddressRecord(@RequestBody CustomerAddress record) {
        return customerAddressService.insertCustomerAddressRecord(record);
    }

    @PostMapping("editCustomerAddress")
    public ResultBean<Void> updateCustomerAddressRecord(@RequestBody CustomerAddress record) {
        return customerAddressService.updateCustomerAddressRecord(record);
    }

    @GetMapping("findAllCustomerAddress")
    public ResultBean<List<CustomerAddress>> findAllCustomerAddress() {
        return customerAddressService.findCustomerAddressRecord();
    }

    @PostMapping("findAllCustomerAddress")
    public ResultBean<List<CustomerAddress>> findAllCustomerAddress(@RequestBody PageInfo pageInfo) {
        return customerAddressService.findAllCustomerAddressRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteCustomerAddress")
    public ResultBean<Void> deleteCustomerAddressRecord(@RequestBody List<Integer> selectMultipleId) {
        return customerAddressService.deleteCustomerAddressRecord(selectMultipleId);
    }

}