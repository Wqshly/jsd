package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * customer_landing
 * @author 
 */
public class CustomerLanding implements Serializable {
    private Integer id;

    private Integer customerUserId;

    private String landingPoint;

    private Date lastLandingTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(Integer customerUserId) {
        this.customerUserId = customerUserId;
    }

    public String getLandingPoint() {
        return landingPoint;
    }

    public void setLandingPoint(String landingPoint) {
        this.landingPoint = landingPoint;
    }

    public Date getLastLandingTime() {
        return lastLandingTime;
    }

    public void setLastLandingTime(Date lastLandingTime) {
        this.lastLandingTime = lastLandingTime;
    }
}