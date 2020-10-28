package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.OrderDetailsMapper;
import com.wqs.jsd.dao.StaffMapper;
import com.wqs.jsd.pojo.OrderDetails;
import com.wqs.jsd.service.OrderDetailsService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.SUCCESS;
import static com.wqs.jsd.beans.ResultBean.UNKNOWN_EXCEPTION;

/**
 * @Author: wan
 * @Date: Created in 20:12 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(OrderDetailsService.class);

    @Resource
    private OrderDetailsMapper mapper;
    @Resource
    private StaffMapper staffMapper;
    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<OrderDetails> findOrderDetailByOrderId(int ordersId) {
        try {
            OrderDetails records = mapper.findOrderDetailByOrderId(ordersId);
            records.setStaff(staffMapper.selectByPrimaryKey(records.getId()));
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> insertOrderDetailsRecord(OrderDetails record) {
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateOrderDetailsRecord(OrderDetails record) {
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<OrderDetails>> findOrderDetailsRecord() {
        try {
            List<OrderDetails> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<OrderDetails>> findAllOrderDetailsRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<OrderDetails> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteOrderDetailsRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKeys(id));
    }
}