package com.wqs.jsd.pojo;

import java.io.Serializable;

/**
 * user_head_sculpture
 * @author 
 */
public class UserHeadSculpture implements Serializable {
    private Integer id;

    private Integer userId;

    private String picLocation;

    private String isCurrentPic;

    private static final long serialVersionUID = 1L;

    public UserHeadSculpture() {
    }

    public UserHeadSculpture(Integer userId, String picLocation, String isCurrentPic) {
        this.userId = userId;
        this.picLocation = picLocation;
        this.isCurrentPic = isCurrentPic;
    }

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

    public String getPicLocation() {
        return picLocation;
    }

    public void setPicLocation(String picLocation) {
        this.picLocation = picLocation;
    }

    public String getIsCurrentPic() {
        return isCurrentPic;
    }

    public void setIsCurrentPic(String isCurrentPic) {
        this.isCurrentPic = isCurrentPic;
    }
}