package com.wqs.jsd;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.ToolsStock;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:01 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface ToolsStockService {

    ResultBean<Void> insertToolsStockRecord(ToolsStock record);

    ResultBean<Void> updateToolsStockRecord(ToolsStock record);

    ResultBean<List<ToolsStock>> findToolsStockRecord();

    ResultBean<List<ToolsStock>> findAllToolsStockRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteToolsStockRecord(List<Integer> id);
}