package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.*;
import com.wqs.jsd.service.ContractDetailService;
import com.wqs.jsd.service.ContractService;
import com.wqs.jsd.service.CustomerService;
import com.wqs.jsd.util.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    private CommonMethod commonMethod;

    @GetMapping("getVerifyCode/{phoneNumber}")
    public ResultBean<Void> getVerifyCode(@PathVariable String phoneNumber) {
        return customerService.getVerifyCode(phoneNumber);
    }

    @PostMapping("validPhoneNum")
    public ResultBean<Boolean> validPhoneNum(@RequestBody String phoneNum, HttpServletRequest request) {
        return customerService.validPhoneNum(phoneNum);
    }

    // 移动端普通用户注册
    @PostMapping("register4Phone")
    public ResultBean<Customer> register4Phone(@RequestBody Register4Phone register4Phone) {
        return customerService.register4Phone(register4Phone);
    }

    // 手机端的登录
    @PostMapping("login4Phone")
    public ResultBean<Customer> login4Phone(@RequestBody Customer customer) {
        return customerService.login4Phone(customer);
    }

    @PostMapping("addCustomer")
    public ResultBean<Void> insertCustomerRecord(@RequestBody Customer record) {
        return customerService.insertCustomerRecord(record);
    }

    @PostMapping("editCustomer")
    public ResultBean<Void> updateCustomerRecord(@RequestBody Customer record) {
        return customerService.updateCustomerRecord(record);
    }

    @GetMapping("getCustomerInfo/{id}")
    public ResultBean<Customer> getCustomerInfo(@PathVariable("id") String id) {
        return customerService.getCustomerInfo(Integer.parseInt(id));
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

    @PostMapping("imageUpload")
    public ResultBean<String> UploadImage(@RequestBody ImageFile imageFile) {
        return commonMethod.UploadImage(imageFile.getName(), imageFile.getFile(), "image\\customer");
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