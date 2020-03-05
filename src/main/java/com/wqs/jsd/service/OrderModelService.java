package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.OrderModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:56 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface OrderModelService {

    ResultBean<Void> insertOrderModelRecord(OrderModel record);

    ResultBean<Void> updateOrderModelRecord(OrderModel record);

    ResultBean<List<OrderModel>> findOrderModelRecord();

    ResultBean<List<OrderModel>> findAllOrderModelRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteOrderModelRecord(List<Integer> id);
}