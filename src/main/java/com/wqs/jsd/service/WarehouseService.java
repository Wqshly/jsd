package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Warehouse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:02 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface WarehouseService {

    ResultBean<Void> insertWarehouseRecord(Warehouse record);

    ResultBean<Void> updateWarehouseRecord(Warehouse record);

    ResultBean<List<Warehouse>> findWarehouseRecord();

    ResultBean<List<Warehouse>> findAllWarehouseRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteWarehouseRecord(List<Integer> id);
}