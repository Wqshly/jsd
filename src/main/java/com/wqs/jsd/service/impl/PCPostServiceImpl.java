package com.wqs.jsd.service.impl;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.dao.PostMapper;
import com.wqs.jsd.pojo.Post;
import com.wqs.jsd.service.PostService;
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
 * @Date: Created in 10:33 2020/1/13
 * @Description:
 * @Modified By:
 */
@Service
public class PCPostServiceImpl implements PostService {

    private static final Logger logger = LoggerFactory.getLogger(PostService.class);

    @Resource
    private PostMapper postMapper;

    @Autowired
    private CommonMethod commonMethod;

    @Override
    public ResultBean<Void> insertPostRecord(Post post) {
        post.setFinalEditTime(commonMethod.getTime());
        if (post.getRadio().equals("1")) {
            post.setNumber("GW" + CodeUtil.createCode());
        }
        return commonMethod.changeRecord(postMapper.insert(post));
    }

    @Override
    public ResultBean<Void> updatePostRecord(Post post) {
        post.setFinalEditTime(commonMethod.getTime());
        return commonMethod.changeRecord(postMapper.updateByPrimaryKey(post));
    }

    @Override
    public ResultBean<List<Post>> findAllPost() {
        try {
            return new ResultBean<>(postMapper.selectAll(), SUCCESS, "success");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResultBean<>(UNKNOWN_EXCEPTION, "未知错误,请联系管理员!");
        }
    }

    @Override
    public ResultBean<Void> deletePost(List<Integer> id) {
        return commonMethod.changeRecord(postMapper.deleteByPrimaryKey(id));
    }
}
