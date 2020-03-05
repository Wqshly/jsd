package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Discount;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:55 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface DiscountService {

    ResultBean<Void> insertDiscountRecord(Discount record);

    ResultBean<Void> updateDiscountRecord(Discount record);

    ResultBean<List<Discount>> findDiscountRecord();

    ResultBean<List<Discount>> findAllDiscountRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteDiscountRecord(List<Integer> id);
}