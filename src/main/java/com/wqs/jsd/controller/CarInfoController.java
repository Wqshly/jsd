package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CarInfo;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 9:14 2020/3/4
 * @Description:
 * @Modified By:
 */
@RequestMapping("/carInfo")
@RestController
public class CarInfoController {
    @Autowired
    private CarInfoService carInfoService;

    @PostMapping("addCarInfo")
    public ResultBean<Void> insertCarInfo(@RequestBody CarInfo record) {
        return carInfoService.insertCarInfoRecord(record);
    }

    @PostMapping("editCarInfo")
    public ResultBean<Void> updateCarInfoRecord(@RequestBody CarInfo record) {
        return carInfoService.updateCarInfoRecord(record);
    }

    @GetMapping("findAllCarInfo")
    public ResultBean<List<CarInfo>> findAllCarInfo() {
        return carInfoService.findCarInfoRecord();
    }

    @PostMapping("findAllCarInfo")
    public ResultBean<List<CarInfo>> findAllCarInfo(@RequestBody PageInfo pageInfo) {
        return carInfoService.findAllCarInfoRecord(pageInfo.getPage().getNum(),pageInfo.getPage().getSize());
    }

    @PostMapping("deleteCarInfo")
    public ResultBean<Void> deleteCarInfoRecord(@RequestBody List<Integer> selectMultipleId) {
        return carInfoService.deleteCarInfoRecord(selectMultipleId);
    }

}
