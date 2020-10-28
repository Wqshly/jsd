package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Orders;
import com.wqs.jsd.pojo.PlaceOrder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:57 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface OrdersService {

    ResultBean<Void> insertOrdersRecord(Orders record);

    ResultBean<Void> updateOrdersRecord(Orders record);

    ResultBean<List<Orders>> findOrdersRecord();

    ResultBean<List<Orders>> findAllOrdersRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteOrdersRecord(List<Integer> id);

    ResultBean<Void> placeOrder(PlaceOrder placeOrder);

    /**
     * @date 2020.10.28
     * @param customerId
     * @return
     * @Introduction 按客户id 查询订单信息
     */
    ResultBean<List<Orders>> findOrdersByCustomerId(int customerId);
}