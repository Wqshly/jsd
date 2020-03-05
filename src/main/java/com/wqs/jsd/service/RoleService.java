package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 19:58 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface RoleService {

    ResultBean<Void> insertRoleRecord(Role record);

    ResultBean<Void> updateRoleRecord(Role record);

    ResultBean<List<Role>> findRoleRecord();

    ResultBean<List<Role>> findAllRoleRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteRoleRecord(List<Integer> id);
}