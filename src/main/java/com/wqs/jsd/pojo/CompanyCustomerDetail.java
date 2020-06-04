package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * company_customer_detail
 * @author 
 */
public class CompanyCustomerDetail implements Serializable {
    private Integer id;

    private Integer companyCustomerId;

    private String contactName;

    private String contactPost;

    private String contactPhone;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyCustomerId() {
        return companyCustomerId;
    }

    public void setCompanyCustomerId(Integer companyCustomerId) {
        this.companyCustomerId = companyCustomerId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPost() {
        return contactPost;
    }

    public void setContactPost(String contactPost) {
        this.contactPost = contactPost;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
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