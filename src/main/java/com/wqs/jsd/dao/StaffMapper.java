package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.Staff;

import java.util.List;

public interface StaffMapper {

    int deleteByPrimaryKey(List<Integer> id);

    List<Staff> selectAll();

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer id);

    int countStaff();

    int countNumber(String s);

    int countPhone(String s);

    int countNumberOrPhone(String s);

    // 通过手机号或员工编号查到员工信息
    Staff selectByNumberOrPhone(String s);

    // 通过手机号或员工编号查寻是否有满足条件的员工
    int selectIdByNumberOrPhone(String s);

    int selectIdByNumber(String number);

    int selectIdByPhone(String phone);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}