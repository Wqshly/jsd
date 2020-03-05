package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Contract;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:52 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface ContractService {

    ResultBean<Void> insertContractRecord(Contract record);

    ResultBean<Void> updateContractRecord(Contract record);

    ResultBean<List<Contract>> findContractRecord();

    ResultBean<List<Contract>> findAllContractRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteContractRecord(List<Integer> id);
}