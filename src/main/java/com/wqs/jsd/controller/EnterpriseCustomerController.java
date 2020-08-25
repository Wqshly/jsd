package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.EnterpriseCustomer;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.EnterpriseCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 16:16 2020/8/9
 * @Description:
 * @Modified By:
 */
@RequestMapping("/enterpriseCustomer")
@RestController
public class EnterpriseCustomerController {
    @Autowired
    private EnterpriseCustomerService enterpriseCustomerService;

    @GetMapping("validPhoneNum//{contactPhoneNumber}")
    public ResultBean<Boolean> validPhoneNum(@PathVariable String contactPhoneNumber) {
        return enterpriseCustomerService.validPhoneNum(contactPhoneNumber);
    }

    @PostMapping("addEnterpriseCustomer")
    public ResultBean<Void> insertEnterpriseCustomerRecord(@RequestBody EnterpriseCustomer record) {
        return enterpriseCustomerService.insertEnterpriseCustomerRecord(record);
    }

    @PostMapping("editEnterpriseCustomer")
    public ResultBean<Void> updateEnterpriseCustomerRecord(@RequestBody EnterpriseCustomer record) {
        return enterpriseCustomerService.updateEnterpriseCustomerRecord(record);
    }

    @GetMapping("findAllEnterpriseCustomer")
    public ResultBean<List<EnterpriseCustomer>> findAllEnterpriseCustomer() {
        return enterpriseCustomerService.findEnterpriseCustomerRecord();
    }

    @PostMapping("findAllEnterpriseCustomer")
    public ResultBean<List<EnterpriseCustomer>> findAllEnterpriseCustomer(@RequestBody PageInfo pageInfo) {
        return enterpriseCustomerService.findAllEnterpriseCustomerRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteEnterpriseCustomer")
    public ResultBean<Void> deleteEnterpriseCustomerRecord(@RequestBody List<Integer> selectMultipleId) {
        return enterpriseCustomerService.deleteEnterpriseCustomerRecord(selectMultipleId);
    }

}