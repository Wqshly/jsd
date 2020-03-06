package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 10:31 2020/1/13
 * @Description:
 * @Modified By:
 */
@Service
public interface PostService {
    ResultBean<Void> insertPostRecord(Post post);

    ResultBean<Void> updatePostRecord(Post post);

    ResultBean<List<Post>> findAllPost();

    ResultBean<List<Post>> findAllPost(int currentPage,int pageSize);

    ResultBean<Void> deletePost(List<Integer> id);
}
