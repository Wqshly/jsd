package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.OrdersMapper;
import com.wqs.jsd.manager.SendSms;
import com.wqs.jsd.pojo.Orders;
import com.wqs.jsd.pojo.PlaceOrder;
import com.wqs.jsd.service.OrdersService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.*;

/**
 * @Author: wan
 * @Date: Created in 20:11 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    private static final Logger logger = LoggerFactory.getLogger(OrdersService.class);

    @Resource
    private OrdersMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Autowired
    private SendSms sendSms;

    @Override
    public ResultBean<Void> insertOrdersRecord(Orders record) {
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateOrdersRecord(Orders record) {
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<Orders>> findOrdersRecord() {
        try {
            List<Orders> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<Orders>> findAllOrdersRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<Orders> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteOrdersRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public ResultBean<Void> placeOrder(PlaceOrder placeOrder) {
        try {
            sendSms.sendSms("青岛洁万城", "SMS_193243567", "17685724016", "{\"name\":\"" + placeOrder.getCustomerName() + "\",\"phone\":\"" + placeOrder.getPhoneNumber() + "\",\"time\":\"" + placeOrder.getTime() + "\"}");
            return new ResultBean<>(SUCCESS,"下单成功");
        } catch (Exception e) {
            return new ResultBean<>(FAILURE, "下单失败");
        }
    }
}