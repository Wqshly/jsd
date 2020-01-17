package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Division;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 16:48 2020/1/17
 * @Description:
 * @Modified By:
 */
@Service
public interface DivisionService {
    ResultBean<Void> insertDivisionRecord(Division division);

    ResultBean<Void> updateDivisionRecord(Division division);

    ResultBean<List<Division>> findAllDivision();

    ResultBean<Void> deleteDivision(List<Integer> id);
}
