package com.wqs.jsd.service.impl;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.BasicCodingMapper;
import com.wqs.jsd.pojo.BasicCoding;
import com.wqs.jsd.service.BasicCodingService;
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
 * @Date: Created in 9:27 2020/1/13
 * @Description:
 * @Modified By:
 */
@Service
public class BasicCodingServiceImpl implements BasicCodingService {
    private static final Logger logger = LoggerFactory.getLogger(BasicCodingService.class);
    @Resource
    private BasicCodingMapper basicCodingMapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertBasicCodingRecord(BasicCoding basicCoding) {
        String abbr = commonMethod.getPinYinHeader(basicCoding.getName());
        basicCoding.setAbbreviation(abbr);
        basicCoding.setFinalEditTime(commonMethod.getTime());
        if (basicCoding.getType().equals("staffStatus")) {
            basicCoding.setCodingStyle("ZT" + CodeUtil.createCode());
        }
        return commonMethod.changeRecord(basicCodingMapper.insert(basicCoding));
    }

    @Override
    public ResultBean<Void> updateBasicCodingRecord(BasicCoding basicCoding) {
        return commonMethod.changeRecord(basicCodingMapper.updateByPrimaryKey(basicCoding));
    }

    @Override
    public ResultBean<List<BasicCoding>> findBasicCodingByType(String s) {
        try {
            System.out.println(s);
            return new ResultBean<>(basicCodingMapper.selectByType(s), SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteBasicCoding(List<Integer> id) {
        return commonMethod.changeRecord(basicCodingMapper.deleteByPrimaryKey(id));
    }
}
