package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.ContractDetail;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:53 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface ContractDetailService {

    ResultBean<Void> insertContractDetailRecord(ContractDetail record);

    ResultBean<Void> updateContractDetailRecord(ContractDetail record);

    ResultBean<List<ContractDetail>> findContractDetailRecord();

    ResultBean<List<ContractDetail>> findAllContractDetailRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteContractDetailRecord(List<Integer> id);
}