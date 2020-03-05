package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * vehicle_maintenance
 * @author 
 */
public class VehicleMaintenance implements Serializable {
    private Integer id;

    private Integer carId;

    private String maintenancePerson;

    private Date maintenanceTime;

    private String finalEditor;

    private Date finalEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getMaintenancePerson() {
        return maintenancePerson;
    }

    public void setMaintenancePerson(String maintenancePerson) {
        this.maintenancePerson = maintenancePerson;
    }

    public Date getMaintenanceTime() {
        return maintenanceTime;
    }

    public void setMaintenanceTime(Date maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
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