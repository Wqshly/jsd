package com.wqs.jsd.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 *
 * @author
 */
@Component
public class User implements Serializable {
    private Integer id;

    private Integer staffId;

    private String password;

    private String status;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public User() {
    }

    public User(Integer staffId, String password) {
        this.staffId = staffId;
        this.password = password;
    }

    public void userInitRegister(Integer staffId, String password, String status, String finalEditor, Date finalEditTime) {
        this.staffId = staffId;
        this.password = password;
        this.status = status;
        this.finalEditor = finalEditor;
        this.finalEditTime = finalEditTime;
    }

    public void userLogin(Integer staffId, String password) {
        this.staffId = staffId;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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