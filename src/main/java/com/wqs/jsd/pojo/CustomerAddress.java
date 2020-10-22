package com.wqs.jsd.pojo;

import java.io.Serializable;

/**
 * customer_address
 * @author 
 */
public class CustomerAddress implements Serializable {
    private Integer id;

    private Integer customerId;

    private String customerName;

    private String customerPhone;

    private Byte isDefaultAddress;

    private String addressName;

    private String detailAddress;

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Byte getIsDefaultAddress() {
        return isDefaultAddress;
    }

    public void setIsDefaultAddress(Byte isDefaultAddress) {
        this.isDefaultAddress = isDefaultAddress;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
}