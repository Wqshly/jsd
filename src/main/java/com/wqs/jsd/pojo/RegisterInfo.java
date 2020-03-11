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

    private String phoneNum;

    private String nickName;

    private String password;

    private String imgPath;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getFinalEditor() {
        return finalEditor;
    }

    public void setFinalEditor(String finalEditor) {
        this.finalEditor = finalEditor;
    }

    public Date getFinalEditTime() {
        return finalEditTime;
    }

    public void setFinalEditTime(Date finalEditTime) {
        this.finalEditTime = finalEditTime;
    }
}
