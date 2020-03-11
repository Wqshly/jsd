package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wan
 * @Date: Created in 13:43 2020/3/11
 * @Description:
 * @Modified By:
 */
public class RegisterInfo implements Serializable {

    private String phone;

    private String nickName;

    private String password;

    private String picLocation;

    private static final long serialVersionUID = 1L;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicLocation() {
        return picLocation;
    }

    public void setPicLocation(String picLocation) {
        this.picLocation = picLocation;
    }
}
