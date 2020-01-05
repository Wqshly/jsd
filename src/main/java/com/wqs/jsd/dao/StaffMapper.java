package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer id);

    int countStaff();

    int countNumber(String s);

    int countPhone(String s);

    int countNumberOrPhone(String s);

    int selectIdByNumberOrPhone(String s);

    int selectIdByNumber(String number);

    int selectIdByPhone(String phone);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}