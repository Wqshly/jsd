package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * basic_coding
 * @author 
 */
public class BasicCoding implements Serializable {
    private Integer id;

    private String name;

    private String type;

    private String abbreviation;

    private String codingStyle;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getCodingStyle() {
        return codingStyle;
    }

    public void setCodingStyle(String codingStyle) {
        this.codingStyle = codingStyle;
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