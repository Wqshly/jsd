package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.DivisionMapper;
import com.wqs.jsd.pojo.Division;
import com.wqs.jsd.service.DivisionService;
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
 * @Author:
 * @Date: Created in 16:49 2020/1/17
 * @Description:
 * @Modified By:
 */
@Service
public class DivisionServiceImpl implements DivisionService {

    private static final Logger logger = LoggerFactory.getLogger(DivisionService.class);

    @Resource
    private DivisionMapper divisionMapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertDivisionRecord(Division division) {
        division.setFinalEditTime(commonMethod.getTime());
        if (division.getRadio().equals("1")) {
            System.out.println(division.getRadio());
            division.setNumber("QH" + CodeUtil.createCode());
        }
        return commonMethod.changeRecord(divisionMapper.insert(division));
    }

    @Override
    public ResultBean<Void> updateDivisionRecord(Division division) {
        division.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(divisionMapper.updateByPrimaryKey(division));
    }

    @Override
    public ResultBean<List<Division>> findAllDivision(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<Division> divisions = divisionMapper.selectAll();
            return new ResultBean<>(divisions, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteDivision(List<Integer> id) {
        return commonMethod.changeRecord(divisionMapper.deleteByPrimaryKey(id));
    }
}
