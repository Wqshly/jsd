package com.wqs.jsd.dao;

import com.wqs.jsd.pojo.VehicleMaintenance;

import java.util.List;

public interface VehicleMaintenanceMapper {

    int countTotal();

    int deleteByPrimaryKey(List<Integer> id);

    List<VehicleMaintenance> selectAll();

    int insert(VehicleMaintenance record);

    int insertSelective(VehicleMaintenance record);

    VehicleMaintenance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VehicleMaintenance record);

    int updateByPrimaryKey(VehicleMaintenance record);
}