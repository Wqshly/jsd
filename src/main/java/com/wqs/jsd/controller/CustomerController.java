package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Contract;
import com.wqs.jsd.pojo.ContractDetail;
import com.wqs.jsd.pojo.Customer;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.ContractDetailService;
import com.wqs.jsd.service.ContractService;
import com.wqs.jsd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 21:05 2020/3/6
 * @Description:
 * @Modified By:
 */
@RequestMapping("/customer")
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private ContractDetailService contractDetailService;

    @PostMapping("addCustomer")
    public ResultBean<Void> insertCustomerRecord(@RequestBody Customer record) {
        return customerService.insertCustomerRecord(record);
    }

    @PostMapping("editCustomer")
    public ResultBean<Void> updateCustomerRecord(@RequestBody Customer record) {
        return customerService.updateCustomerRecord(record);
    }

    @GetMapping("findAllCustomer")
    public ResultBean<List<Customer>> findAllCustomer() {
        return customerService.findCustomerRecord();
    }

    @PostMapping("findAllCustomer")
    public ResultBean<List<Customer>> findAllCustomer(@RequestBody PageInfo pageInfo) {
        return customerService.findAllCustomerRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteCustomer")
    public ResultBean<Void> deleteCustomerRecord(@RequestBody List<Integer> selectMultipleId) {
        return customerService.deleteCustomerRecord(selectMultipleId);
    }

    @PostMapping("addContract")
    public ResultBean<Void> insertContractRecord(@RequestBody Contract record) {
        return contractService.insertContractRecord(record);
    }

    @PostMapping("editContract")
    public ResultBean<Void> updateContractRecord(@RequestBody Contract record) {
        return contractService.updateContractRecord(record);
    }

    @GetMapping("findAllContract")
    public ResultBean<List<Contract>> findAllContract() {
        return contractService.findContractRecord();
    }

    @PostMapping("findAllContract")
    public ResultBean<List<Contract>> findAllContract(@RequestBody PageInfo pageInfo) {
        return contractService.findAllContractRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteContract")
    public ResultBean<Void> deleteContractRecord(@RequestBody List<Integer> selectMultipleId) {
        return contractService.deleteContractRecord(selectMultipleId);
    }

    @PostMapping("addContractDetail")
    public ResultBean<Void> insertContractDetailRecord(@RequestBody ContractDetail record) {
        return contractDetailService.insertContractDetailRecord(record);
    }

    @PostMapping("editContractDetail")
    public ResultBean<Void> updateContractDetailRecord(@RequestBody ContractDetail record) {
        return contractDetailService.updateContractDetailRecord(record);
    }

    @GetMapping("findAllContractDetail")
    public ResultBean<List<ContractDetail>> findAllContractDetail() {
        return contractDetailService.findContractDetailRecord();
    }

    @PostMapping("findAllContractDetail")
    public ResultBean<List<ContractDetail>> findAllContractDetail(@RequestBody PageInfo pageInfo) {
        return contractDetailService.findAllContractDetailRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteContractDetail")
    public ResultBean<Void> deleteContractDetailRecord(@RequestBody List<Integer> selectMultipleId) {
        return contractDetailService.deleteContractDetailRecord(selectMultipleId);
    }

}