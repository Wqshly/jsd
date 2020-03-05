package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.OrderRecept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:57 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface OrderReceptService {

    ResultBean<Void> insertOrderReceptRecord(OrderRecept record);

    ResultBean<Void> updateOrderReceptRecord(OrderRecept record);

    ResultBean<List<OrderRecept>> findOrderReceptRecord();

    ResultBean<List<OrderRecept>> findAllOrderReceptRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteOrderReceptRecord(List<Integer> id);
}