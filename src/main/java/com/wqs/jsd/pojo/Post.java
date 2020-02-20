package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * post
 * @author 
 */
public class Post implements Serializable {
    private Integer id;

    private String radio;

    private String number;

    private String upperNumber;

    private String name;

    private String responsibilities;

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

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUpperNumber() {
        return upperNumber;
    }

    public void setUpperNumber(String upperNumber) {
        this.upperNumber = upperNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
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