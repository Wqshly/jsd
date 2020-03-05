package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Commissions;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:52 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface CommissionsService {

    ResultBean<Void> insertCommissionsRecord(Commissions record);

    ResultBean<Void> updateCommissionsRecord(Commissions record);

    ResultBean<List<Commissions>> findCommissionsRecord();

    ResultBean<List<Commissions>> findAllCommissionsRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteCommissionsRecord(List<Integer> id);
}