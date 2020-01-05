package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * detail_tools_out_in
 * @author 
 */
public class DetailToolsOutIn implements Serializable {
    private Integer id;

    private Integer toolsId;

    private Integer billsOutInId;

    private Integer warehouseId;

    private String type;

    private String toolsDocumentNumber;

    private String finelEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getToolsId() {
        return toolsId;
    }

    public void setToolsId(Integer toolsId) {
        this.toolsId = toolsId;
    }

    public Integer getBillsOutInId() {
        return billsOutInId;
    }

    public void setBillsOutInId(Integer billsOutInId) {
        this.billsOutInId = billsOutInId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToolsDocumentNumber() {
        return toolsDocumentNumber;
    }

    public void setToolsDocumentNumber(String toolsDocumentNumber) {
        this.toolsDocumentNumber = toolsDocumentNumber;
    }

    public String getFinelEditor() {
        return finelEditor;
    }

    public void setFinelEditor(String finelEditor) {
        this.finelEditor = finelEditor;
    }

    public Date getFinalEditTime() {
        return finalEditTime;
    }

    public void setFinalEditTime(Date finalEditTime) {
        this.finalEditTime = finalEditTime;
    }
}