package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.ToolsUse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:07 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface ToolsUseService {

    ResultBean<Void> insertToolsUseRecord(ToolsUse record);

    ResultBean<Void> updateToolsUseRecord(ToolsUse record);

    ResultBean<List<ToolsUse>> findToolsUseRecord();

    ResultBean<List<ToolsUse>> findAllToolsUseRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteToolsUseRecord(List<Integer> id);
}