package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.MemberMapper;
import com.wqs.jsd.pojo.Member;
import com.wqs.jsd.service.MemberService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.SUCCESS;
import static com.wqs.jsd.beans.ResultBean.UNKNOWN_EXCEPTION;

/**
 * @Author: wan
 * @Date: Created in 20:12 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class MemberServiceImpl implements MemberService {

    private static final Logger logger = LoggerFactory.getLogger(MemberService.class);

    @Resource
    private MemberMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertMemberRecord(Member record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateMemberRecord(Member record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<Member>> findMemberRecord() {
        try {
            List<Member> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<Member>> findAllMemberRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<Member> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteMemberRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}