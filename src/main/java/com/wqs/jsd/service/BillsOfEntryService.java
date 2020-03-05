package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.BillsOfEntry;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:50 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface BillsOfEntryService {

    ResultBean<Void> insertBillsOfEntryRecord(BillsOfEntry record);

    ResultBean<Void> updateBillsOfEntryRecord(BillsOfEntry record);

    ResultBean<List<BillsOfEntry>> findBillsOfEntryRecord();

    ResultBean<List<BillsOfEntry>> findAllBillsOfEntryRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteBillsOfEntryRecord(List<Integer> id);
}