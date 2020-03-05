package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.DetailToolsOutIn;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:54 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface DetailToolsOutInService {

    ResultBean<Void> insertDetailToolsOutInRecord(DetailToolsOutIn record);

    ResultBean<Void> updateDetailToolsOutInRecord(DetailToolsOutIn record);

    ResultBean<List<DetailToolsOutIn>> findDetailToolsOutInRecord();

    ResultBean<List<DetailToolsOutIn>> findAllDetailToolsOutInRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteDetailToolsOutInRecord(List<Integer> id);
}