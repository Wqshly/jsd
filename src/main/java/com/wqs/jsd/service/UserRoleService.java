package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.UserRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:02 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface UserRoleService {

    ResultBean<Void> insertUserRoleRecord(UserRole record);

    ResultBean<Void> updateUserRoleRecord(UserRole record);

    ResultBean<List<UserRole>> findUserRoleRecord();

    ResultBean<List<UserRole>> findAllUserRoleRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteUserRoleRecord(List<Integer> id);
}