package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.OrderTaskModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:57 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface OrderTaskModelService {

    ResultBean<Void> insertOrderTaskModelRecord(OrderTaskModel record);

    ResultBean<Void> updateOrderTaskModelRecord(OrderTaskModel record);

    ResultBean<List<OrderTaskModel>> findOrderTaskModelRecord();

    ResultBean<List<OrderTaskModel>> findAllOrderTaskModelRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteOrderTaskModelRecord(List<Integer> id);
}