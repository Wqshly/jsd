package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.IsQuit;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:55 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface IsQuitService {

    ResultBean<Void> insertIsQuitRecord(IsQuit record);

    ResultBean<Void> updateIsQuitRecord(IsQuit record);

    ResultBean<List<IsQuit>> findIsQuitRecord();

    ResultBean<List<IsQuit>> findAllIsQuitRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteIsQuitRecord(List<Integer> id);
}