package com.wqs.jsd.pojo;

import java.io.Serializable;

/**
 * customer_head_sculpture
 * @author 
 */
public class CustomerHeadSculpture implements Serializable {
    private Integer id;

    private Integer customerId;

    private String picLocal;

    private String isCurrentPic;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getPicLocal() {
        return picLocal;
    }

    public void setPicLocal(String picLocal) {
        this.picLocal = picLocal;
    }

    public String getIsCurrentPic() {
        return isCurrentPic;
    }

    public void setIsCurrentPic(String isCurrentPic) {
        this.isCurrentPic = isCurrentPic;
    }
}