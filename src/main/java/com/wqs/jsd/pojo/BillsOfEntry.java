package com.wqs.jsd.pojo;

import java.io.Serializable;

/**
 * bills_of_entry
 * @author 
 */
public class BillsOfEntry implements Serializable {
    private Integer id;

    private Integer supplierId;

    private Integer billsOutInId;

    private String name;

    private Integer number;

    private String unit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getBillsOutInId() {
        return billsOutInId;
    }

    public void setBillsOutInId(Integer billsOutInId) {
        this.billsOutInId = billsOutInId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}