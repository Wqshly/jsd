package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.OrderDetails;
import com.wqs.jsd.pojo.Orders;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.pojo.PlaceOrder;
import com.wqs.jsd.service.OrderDetailsService;
import com.wqs.jsd.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:34 2020/10/27
 * @Description:
 * @Modified By:
 */
@RequestMapping("/orders")
@RestController
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private OrderDetailsService orderDetailsService;

    @PostMapping("addOrders")
    public ResultBean<Void> insertOrdersRecord(@RequestBody Orders record) {
        return ordersService.insertOrdersRecord(record);
    }

    @PostMapping("editOrders")
    public ResultBean<Void> updateOrdersRecord(@RequestBody Orders record) {
        return ordersService.updateOrdersRecord(record);
    }

    @GetMapping("findAllOrders")
    public ResultBean<List<Orders>> findAllOrders() {
        return ordersService.findOrdersRecord();
    }

    @GetMapping("findOrdersByCustomerId/{id}")
    public ResultBean<List<Orders>> findOrdersByCustomerId(@PathVariable("id") String id) {
        return ordersService.findOrdersByCustomerId(Integer.parseInt(id));
    }

    @PostMapping("findAllOrders")
    public ResultBean<List<Orders>> findAllOrders(@RequestBody PageInfo pageInfo) {
        return ordersService.findAllOrdersRecord(pageInfo.getPage().getNum(), pageInfo.getPage().getSize());
    }

    @PostMapping("deleteOrders")
    public ResultBean<Void> deleteOrdersRecord(@RequestBody List<Integer> selectMultipleId) {
        return ordersService.deleteOrdersRecord(selectMultipleId);
    }

    @PostMapping("placeOrder")
    public ResultBean<Void> placeOrder(@RequestBody PlaceOrder placeOrder) {
        return ordersService.placeOrder(placeOrder);
    }

    @GetMapping("findOrderDetailByOrderId/{ordersId}")
    public ResultBean<OrderDetails> findOrderDetailByOrderId(@PathVariable("ordersId") String ordersId) {
        return  orderDetailsService.findOrderDetailByOrderId(Integer.parseInt(ordersId));
    }
}