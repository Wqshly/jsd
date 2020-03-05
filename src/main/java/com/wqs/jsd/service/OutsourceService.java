package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Outsource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:58 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface OutsourceService {

    ResultBean<Void> insertOutsourceRecord(Outsource record);

    ResultBean<Void> updateOutsourceRecord(Outsource record);

    ResultBean<List<Outsource>> findOutsourceRecord();

    ResultBean<List<Outsource>> findAllOutsourceRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteOutsourceRecord(List<Integer> id);
}