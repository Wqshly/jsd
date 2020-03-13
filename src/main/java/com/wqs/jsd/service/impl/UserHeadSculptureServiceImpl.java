package com.wqs.jsd.service.impl;

import com.github.pagehelper.PageHelper;
import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.UserHeadSculptureMapper;
import com.wqs.jsd.dao.UserMapper;
import com.wqs.jsd.pojo.UserHeadSculpture;
import com.wqs.jsd.service.UserHeadSculptureService;
import com.wqs.jsd.util.CodeUtil;
import com.wqs.jsd.util.CommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static com.wqs.jsd.beans.ResultBean.SUCCESS;
import static com.wqs.jsd.beans.ResultBean.UNKNOWN_EXCEPTION;

/**
 * @Author: wan
 * @Date: Created in 20:06 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public class UserHeadSculptureServiceImpl implements UserHeadSculptureService {

    private static final Logger logger = LoggerFactory.getLogger(UserHeadSculptureService.class);

    @Resource
    private UserHeadSculptureMapper mapper;

    @Resource
    private UserMapper userMapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertUserHeadSculptureRecord(UserHeadSculpture record) {
        return commonMethod.changeRecord(mapper.insert(record));
    }

    @Override
    public ResultBean<Void> updateUserHeadSculptureRecord(UserHeadSculpture record) {
        return commonMethod.changeRecord(mapper.updateByPrimaryKey(record));
    }

    @Override
    public ResultBean<List<UserHeadSculpture>> findUserHeadSculptureRecord() {
        try {
            List<UserHeadSculpture> records = mapper.selectAll();
            return new ResultBean<>(records, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<List<UserHeadSculpture>> findAllUserHeadSculptureRecord(int currentPage, int pageSize) {
        try {
            PageHelper.startPage(currentPage, pageSize);
            List<UserHeadSculpture> records = mapper.selectAll();
            int total = mapper.countTotal();
            return new ResultBean<>(records, SUCCESS, "success", total);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deleteUserHeadSculptureRecord(List<Integer> id) {
        return commonMethod.changeRecord(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public ResultBean<String> getImgUrl(String s) {
        try {
            int staffId = Integer.parseInt(s);
            System.out.println(staffId);
            int userId = userMapper.findUserIdByStaffId(staffId);
            System.out.println(userId);
            String imgUrl = mapper.selectByUserId(userId);
            System.out.println(imgUrl);
            imgUrl = "http://localhost:8080" + imgUrl;
            return new ResultBean<>(imgUrl, SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }
}