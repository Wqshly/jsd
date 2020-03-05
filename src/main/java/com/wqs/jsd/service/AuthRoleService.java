package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.AuthRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:01 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface AuthRoleService {

    ResultBean<Void> insertAuthRoleRecord(AuthRole record);

    ResultBean<Void> updateAuthRoleRecord(AuthRole record);

    ResultBean<List<AuthRole>> findAuthRoleRecord();

    ResultBean<List<AuthRole>> findAllAuthRoleRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteAuthRoleRecord(List<Integer> id);
}