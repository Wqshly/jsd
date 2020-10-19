package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.BusinessCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 21:46 2020/10/15
 * @Description:
 * @Modified By:
 */
@Service
public interface BusinessCategoryService {

    ResultBean<Void> insertBusinessCategoryRecord(BusinessCategory record);

    ResultBean<Void> updateBusinessCategoryRecord(BusinessCategory record);

    ResultBean<List<BusinessCategory>> findBusinessCategoryRecord();

    ResultBean<List<BusinessCategory>> findAllBusinessCategoryRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteBusinessCategoryRecord(List<Integer> id);

    ResultBean<List<BusinessCategory>> findCategoryByClassRecord(String classification);
}