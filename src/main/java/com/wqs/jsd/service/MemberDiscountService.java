package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.MemberDiscount;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:55 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface MemberDiscountService {

    ResultBean<Void> insertMemberDiscountRecord(MemberDiscount record);

    ResultBean<Void> updateMemberDiscountRecord(MemberDiscount record);

    ResultBean<List<MemberDiscount>> findMemberDiscountRecord();

    ResultBean<List<MemberDiscount>> findAllMemberDiscountRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteMemberDiscountRecord(List<Integer> id);
}