package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.AuthorityMapper;
import com.wqs.jsd.pojo.Authority;
import com.wqs.jsd.service.AuthorityService;
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
 * @Date: Created in 19:00 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    private static final Logger logger = LoggerFactory.getLogger(AuthorityService.class);

    @Resource
    private AuthorityMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertAuthorityRecord(Authority record) {
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateAuthorityRecord(Authority record) {
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<Authority>> findAllAuthorityRecord() {
        try {
            List<Authority> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<Authority>> findAllAuthorityRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<Authority> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteAuthorityRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}