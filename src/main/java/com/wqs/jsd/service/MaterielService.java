package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Warehouse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 10:49 2020/2/26
 * @Description:
 * @Modified By:
 */
@Service
public interface MaterielService {
    ResultBean<Void> insertWarehouse(Warehouse warehouse);

    ResultBean<Void> updateWarehouseRecord(Warehouse warehouse);

    ResultBean<List<Warehouse>> findAllWarehouse(int currentPage, int pageSize);

    ResultBean<Void> deleteWarehouse(List<Integer> id);
}
