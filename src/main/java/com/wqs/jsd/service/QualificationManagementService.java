package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.QualificationManagement;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 15:33 2020/3/12
 * @Description:
 * @Modified By:
 */
@Service
public interface QualificationManagementService {

    ResultBean<Void> insertQualificationManagementRecord(QualificationManagement record);

    ResultBean<Void> updateQualificationManagementRecord(QualificationManagement record);

    ResultBean<List<QualificationManagement>> findQualificationManagementRecord();

    ResultBean<List<QualificationManagement>> findAllQualificationManagementRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteQualificationManagementRecord(List<Integer> id);
}