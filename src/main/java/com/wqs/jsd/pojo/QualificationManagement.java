package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * qualification_management
 * @author 
 */
public class QualificationManagement implements Serializable {
    private Integer id;

    private String number;

    private String name;

    private String category;

    private String entryIntoForceTime;

    private String deadline;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEntryIntoForceTime() {
        return entryIntoForceTime;
    }

    public void setEntryIntoForceTime(String entryIntoForceTime) {
        this.entryIntoForceTime = entryIntoForceTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
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