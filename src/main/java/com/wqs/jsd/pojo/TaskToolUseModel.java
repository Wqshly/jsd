package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * task_tool_use_model
 * @author 
 */
public class TaskToolUseModel implements Serializable {
    private Integer id;

    private Integer orderTaskModelId;

    private Integer toolsId;

    private Integer number;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderTaskModelId() {
        return orderTaskModelId;
    }

    public void setOrderTaskModelId(Integer orderTaskModelId) {
        this.orderTaskModelId = orderTaskModelId;
    }

    public Integer getToolsId() {
        return toolsId;
    }

    public void setToolsId(Integer toolsId) {
        this.toolsId = toolsId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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