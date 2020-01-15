package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.OrderModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 18:27 2020/1/14
 * @Description:
 * @Modified By:
 */
@Service
public interface OrderTypeService {
    ResultBean<Void> insertOrderType(OrderModel orderModel);

    ResultBean<Void> updateOrderType(OrderModel orderModel);

    ResultBean<List<OrderModel>> findAllOrderType();

    ResultBean<Void> deleteOrderTypeRecord(List<Integer> id);
}
