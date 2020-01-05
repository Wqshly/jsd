package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * user_landing
 * @author 
 */
public class UserLanding implements Serializable {
    private Integer id;

    private Integer userId;

    private String landingAddress;

    private Date lastLandingTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLandingAddress() {
        return landingAddress;
    }

    public void setLandingAddress(String landingAddress) {
        this.landingAddress = landingAddress;
    }

    public Date getLastLandingTime() {
        return lastLandingTime;
    }

    public void setLastLandingTime(Date lastLandingTime) {
        this.lastLandingTime = lastLandingTime;
    }
}