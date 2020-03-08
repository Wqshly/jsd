package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.UserHeadSculpture;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:01 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface UserHeadSculptureService {

    ResultBean<Void> insertUserHeadSculptureRecord(UserHeadSculpture record);

    ResultBean<Void> updateUserHeadSculptureRecord(UserHeadSculpture record);

    ResultBean<List<UserHeadSculpture>> findUserHeadSculptureRecord();

    ResultBean<List<UserHeadSculpture>> findAllUserHeadSculptureRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteUserHeadSculptureRecord(List<Integer> id);

    ResultBean<String> getImgUrl(String s);
}