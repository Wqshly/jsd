package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.VehicleMaintenance;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 21:55 2020/3/5
 * @Description:
 * @Modified By:
 */
@Service
public interface VehicleMaintenanceService {

    ResultBean<Void> insertVehicleMaintenanceRecord(VehicleMaintenance record);

    ResultBean<Void> updateVehicleMaintenanceRecord(VehicleMaintenance record);

    ResultBean<List<VehicleMaintenance>> findVehicleMaintenanceRecord();

    ResultBean<List<VehicleMaintenance>> findAllVehicleMaintenanceRecord(int currentPage, int pageSize);

    ResultBean<Void> deleteVehicleMaintenanceRecord(List<Integer> id);
}