package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * outsource
 * @author 
 */
public class Outsource implements Serializable {
    private Integer id;

    private Integer companyId;

    private Integer ordersId;

    private Long spending;

    private Date cooperationTime;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Long getSpending() {
        return spending;
    }

    public void setSpending(Long spending) {
        this.spending = spending;
    }

    public Date getCooperationTime() {
        return cooperationTime;
    }

    public void setCooperationTime(Date cooperationTime) {
        this.cooperationTime = cooperationTime;
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