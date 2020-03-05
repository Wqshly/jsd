package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.OrderDetails;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:
 * @Date: Created in 19:56 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface OrderDetailsService {

    ResultBean<Void> insertOrderDetailsRecord(OrderDetails record);

    ResultBean<Void> updateOrderDetailsRecord(OrderDetails record);

    ResultBean<List<OrderDetails>> findOrderDetailsRecord();

    ResultBean<List<OrderDetails>> findAllOrderDetailsRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteOrderDetailsRecord(List<Integer> id);
}