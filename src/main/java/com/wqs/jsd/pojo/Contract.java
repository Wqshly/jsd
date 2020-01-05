package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * contract
 * @author 
 */
public class Contract implements Serializable {
    private Integer id;

    private String contractNumber;

    private String projectName;

    private Integer customerId;

    private String customerAddress;

    private String customerPhone;

    private String customerRepresent;

    private String ourSide;

    private String ourAddress;

    private String ourPhone;

    private String ourRepresent;

    private Date signingTime;

    private String contractContent;

    private String pledge;

    private String otherItem;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerRepresent() {
        return customerRepresent;
    }

    public void setCustomerRepresent(String customerRepresent) {
        this.customerRepresent = customerRepresent;
    }

    public String getOurSide() {
        return ourSide;
    }

    public void setOurSide(String ourSide) {
        this.ourSide = ourSide;
    }

    public String getOurAddress() {
        return ourAddress;
    }

    public void setOurAddress(String ourAddress) {
        this.ourAddress = ourAddress;
    }

    public String getOurPhone() {
        return ourPhone;
    }

    public void setOurPhone(String ourPhone) {
        this.ourPhone = ourPhone;
    }

    public String getOurRepresent() {
        return ourRepresent;
    }

    public void setOurRepresent(String ourRepresent) {
        this.ourRepresent = ourRepresent;
    }

    public Date getSigningTime() {
        return signingTime;
    }

    public void setSigningTime(Date signingTime) {
        this.signingTime = signingTime;
    }

    public String getContractContent() {
        return contractContent;
    }

    public void setContractContent(String contractContent) {
        this.contractContent = contractContent;
    }

    public String getPledge() {
        return pledge;
    }

    public void setPledge(String pledge) {
        this.pledge = pledge;
    }

    public String getOtherItem() {
        return otherItem;
    }

    public void setOtherItem(String otherItem) {
        this.otherItem = otherItem;
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