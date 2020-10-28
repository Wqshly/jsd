package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * order_details
 * @author 
 */
public class OrderDetails implements Serializable {
    private Integer id;

    private Integer staffId;

    private Integer ordersId;

    private Byte isArrival;

    private Date arrivalTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Byte getIsArrival() {
        return isArrival;
    }

    public void setIsArrival(Byte isArrival) {
        this.isArrival = isArrival;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}