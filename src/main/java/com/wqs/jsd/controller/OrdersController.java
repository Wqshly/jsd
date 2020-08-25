package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.PlaceOrder;
import com.wqs.jsd.service.OrdersService;
import com.wqs.jsd.util.CommonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: wan
 * @Date: Created in 14:18 2020/8/25
 * @Description:
 * @Modified By:
 */
@RequestMapping("/order")
@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @Autowired
    private CommonMethod commonMethod;

    @PostMapping("placeOrder")
    public ResultBean<Void> placeOrder(@RequestBody PlaceOrder placeOrder) {
        return ordersService.placeOrder(placeOrder);
    }
}
