package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * order_task_model
 * @author 
 */
public class OrderTaskModel implements Serializable {
    private Integer id;

    private Integer orderModelId;

    private String taskName;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderModelId() {
        return orderModelId;
    }

    public void setOrderModelId(Integer orderModelId) {
        this.orderModelId = orderModelId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
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