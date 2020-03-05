package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Authority;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 18:37 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface AuthorityService {

    ResultBean<Void> insertAuthorityRecord(Authority record);

    ResultBean<Void> updateAuthorityRecord(Authority record);

    ResultBean<List<Authority>> findAllAuthorityRecord();

    ResultBean<List<Authority>> findAllAuthorityRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteAuthorityRecord(List<Integer> id);
}
