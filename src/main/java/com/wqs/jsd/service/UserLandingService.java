package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.UserLanding;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:02 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface UserLandingService {

    ResultBean<Void> insertUserLandingRecord(UserLanding record);

    ResultBean<Void> updateUserLandingRecord(UserLanding record);

    ResultBean<List<UserLanding>> findUserLandingRecord();

    ResultBean<List<UserLanding>> findAllUserLandingRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteUserLandingRecord(List<Integer> id);
}