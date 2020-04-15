package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.RewardPunishmentMapper;
import com.wqs.jsd.pojo.RewardPunishment;
import com.wqs.jsd.service.RewardPunishmentService;
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
 * @Date: Created in 20:10 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class RewardPunishmentServiceImpl implements RewardPunishmentService {

    private static final Logger logger = LoggerFactory.getLogger(RewardPunishmentService.class);

    @Resource
    private RewardPunishmentMapper mapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertRewardPunishmentRecord(RewardPunishment record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateRewardPunishmentRecord(RewardPunishment record) {
        record.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<RewardPunishment>> findRewardPunishmentRecord() {
        try {
            List<RewardPunishment> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<RewardPunishment>> findAllRewardPunishmentRecord(int currentPage, int pageSize, int id) {
        try {
            PageHelper.startPage(currentPage, pageSize);
//            List<RewardPunishment> records = mapper.selectAll();
//            int total = mapper.countTotal();
            List<RewardPunishment> records = mapper.selectByStaffId(id);
            int total = mapper.countTotalByStaffId(id);
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteRewardPunishmentRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }
}