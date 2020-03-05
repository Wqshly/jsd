package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Salary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:59 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface SalaryService {

    ResultBean<Void> insertSalaryRecord(Salary record);

    ResultBean<Void> updateSalaryRecord(Salary record);

    ResultBean<List<Salary>> findSalaryRecord();

    ResultBean<List<Salary>> findAllSalaryRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteSalaryRecord(List<Integer> id);
}