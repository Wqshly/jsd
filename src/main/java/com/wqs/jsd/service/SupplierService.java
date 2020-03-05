package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:00 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface SupplierService {

    ResultBean<Void> insertSupplierRecord(Supplier record);

    ResultBean<Void> updateSupplierRecord(Supplier record);

    ResultBean<List<Supplier>> findSupplierRecord();

    ResultBean<List<Supplier>> findAllSupplierRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteSupplierRecord(List<Integer> id);
}