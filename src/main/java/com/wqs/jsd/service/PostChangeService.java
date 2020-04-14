package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.PostChange;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 18:52 2020/4/14
 * @Description:
 * @Modified By:
 */
@Service
public interface PostChangeService {

    ResultBean<Void> insertPostChangeRecord(PostChange record);

    ResultBean<Void> updatePostChangeRecord(PostChange record);

    ResultBean<List<PostChange>> findPostChangeRecord();

    ResultBean<List<PostChange>> findAllPostChangeRecord(int currentPage, int pageSize);

    ResultBean<Void> deletePostChangeRecord(List<Integer> id);
}