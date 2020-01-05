package com.wqs.jsd.pojo;

import java.io.Serializable;

/**
 * @Author: wan
 * @Date: Created in 15:51 2019/12/25
 * @Description: 员工注册，登录的实体类
 * @Modified By:
 */
public class StaffUser implements Serializable {
    private int id;
    private String name;
    private String number;
    private String phone;
    private String sex;
    private String identify;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
