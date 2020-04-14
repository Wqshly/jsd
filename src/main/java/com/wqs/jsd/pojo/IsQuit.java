package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * is_quit
 * @author 
 */
public class IsQuit implements Serializable {
    private Integer id;

    private Integer staffId;

    private String isQuit;

    private Date startTime;

    private Date endTime;

    private String reasons;

    private String remarks;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getIsQuit() {
        return isQuit;
    }

    public void setIsQuit(String isQuit) {
        this.isQuit = isQuit;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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