package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * contract
 * @author 
 */
public class Contract implements Serializable {
    private Integer id;

    private Boolean radio;

    private String contractNumber;

    private String projectName;

    private String contractStatus;

    private String partyA;

    private String partyB;

    private String signatoryPartyA;

    private String signatoryPartyB;

    private Date signingTime;

    private Date entryIntoForceTime;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getRadio() {
        return radio;
    }

    public void setRadio(Boolean radio) {
        this.radio = radio;
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

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getPartyA() {
        return partyA;
    }

    public void setPartyA(String partyA) {
        this.partyA = partyA;
    }

    public String getPartyB() {
        return partyB;
    }

    public void setPartyB(String partyB) {
        this.partyB = partyB;
    }

    public String getSignatoryPartyA() {
        return signatoryPartyA;
    }

    public void setSignatoryPartyA(String signatoryPartyA) {
        this.signatoryPartyA = signatoryPartyA;
    }

    public String getSignatoryPartyB() {
        return signatoryPartyB;
    }

    public void setSignatoryPartyB(String signatoryPartyB) {
        this.signatoryPartyB = signatoryPartyB;
    }

    public Date getSigningTime() {
        return signingTime;
    }

    public void setSigningTime(Date signingTime) {
        this.signingTime = signingTime;
    }

    public Date getEntryIntoForceTime() {
        return entryIntoForceTime;
    }

    public void setEntryIntoForceTime(Date entryIntoForceTime) {
        this.entryIntoForceTime = entryIntoForceTime;
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