package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:02 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface UserService {

    ResultBean<Void> insertUserRecord(User record);

    ResultBean<Void> updateUserRecord(User record);

    ResultBean<List<User>> findUserRecord();

    ResultBean<List<User>> findAllUserRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteUserRecord(List<Integer> id);
}