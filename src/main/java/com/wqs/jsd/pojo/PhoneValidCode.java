package com.wqs.jsd.pojo;

import java.io.Serializable;

/**
 * @Author: wan
 * @Date: Created in 11:34 2020/6/5
 * @Description:
 * @Modified By:
 */
public class PhoneValidCode implements Serializable {
    private String phone;
    private String code;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
