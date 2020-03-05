package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.DamageRecord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:54 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface DamageRecordService {

    ResultBean<Void> insertDamageRecordRecord(DamageRecord record);

    ResultBean<Void> updateDamageRecordRecord(DamageRecord record);

    ResultBean<List<DamageRecord>> findDamageRecordRecord();

    ResultBean<List<DamageRecord>> findAllDamageRecordRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteDamageRecordRecord(List<Integer> id);
}