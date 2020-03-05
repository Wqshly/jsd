package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Tools;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:01 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface ToolsService {

    ResultBean<Void> insertToolsRecord(Tools record);

    ResultBean<Void> updateToolsRecord(Tools record);

    ResultBean<List<Tools>> findToolsRecord();

    ResultBean<List<Tools>> findAllToolsRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteToolsRecord(List<Integer> id);
}