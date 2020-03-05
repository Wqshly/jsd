package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Member;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:55 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface MemberService {

    ResultBean<Void> insertMemberRecord(Member record);

    ResultBean<Void> updateMemberRecord(Member record);

    ResultBean<List<Member>> findMemberRecord();

    ResultBean<List<Member>> findAllMemberRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteMemberRecord(List<Integer> id);
}