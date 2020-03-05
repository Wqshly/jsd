package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.BillsOutIn;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:52 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface BillsOutInService {

    ResultBean<Void> insertBillsOutInRecord(BillsOutIn record);

    ResultBean<Void> updateBillsOutInRecord(BillsOutIn record);

    ResultBean<List<BillsOutIn>> findBillsOutInRecord();

    ResultBean<List<BillsOutIn>> findAllBillsOutInRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteBillsOutInRecord(List<Integer> id);
}