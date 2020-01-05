package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * tools_stock
 * @author 
 */
public class ToolsStock implements Serializable {
    private Integer id;

    private Integer warehouseId;

    private Integer toolsId;

    private Integer number;

    private String unit;

    private String finalEdit;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFinalEdit() {
        return finalEdit;
    }

    public void setFinalEdit(String finalEdit) {
        this.finalEdit = finalEdit;
    }

    public Date getFinalEditTime() {
        return finalEditTime;
    }

    public void setFinalEditTime(Date finalEditTime) {
        this.finalEditTime = finalEditTime;
    }
}