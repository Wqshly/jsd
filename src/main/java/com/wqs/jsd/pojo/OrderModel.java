package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * order_model
 * @author 
 */
public class OrderModel implements Serializable {
    private Integer id;

    private String name;

    private String number;

    private String upperNumber;

    private String description;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getUpperNumber() {
        return upperNumber;
    }

    public void setUpperNumber(String upperNumber) {
        this.upperNumber = upperNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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