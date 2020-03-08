package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.OrderModel;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.OrderModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:36 2020/3/6
 * @Description:
 * @Modified By:
 */
@RequestMapping("/orderType")
@RestController
public class OrderModelController {
    @Autowired
    private OrderModelService orderModelService;

    @PostMapping("addOrderModel")
    public ResultBean<Void> insertOrderModelRecord(@RequestBody OrderModel record) {
        return orderModelService.insertOrderModelRecord(record);
    }

    @PostMapping("editOrderModel")
    public ResultBean<Void> updateOrderModelRecord(@RequestBody OrderModel record) {
        return orderModelService.updateOrderModelRecord(record);
    }

    @GetMapping("findAllOrderModel")
    public ResultBean<List<OrderModel>> findAllOrderModel() {
        return orderModelService.findOrderModelRecord();
    }

    @PostMapping("findAllOrderModel")
    public ResultBean<List<OrderModel>> findAllOrderModel(@RequestBody PageInfo pageInfo) {
        return orderModelService.findAllOrderModelRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteOrderModel")
    public ResultBean<Void> deleteOrderModelRecord(@RequestBody List<Integer> selectMultipleId) {
        return orderModelService.deleteOrderModelRecord(selectMultipleId);
    }

}