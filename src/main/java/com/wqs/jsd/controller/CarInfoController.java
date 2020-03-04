package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.CarInfo;
import com.wqs.jsd.pojo.PageInfo;
import com.wqs.jsd.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("findAllCarInfo")
    public ResultBean<List<CarInfo>> findAllDivision(@RequestBody PageInfo pageInfo) {
        return carInfoService.findAllCarInfo(pageInfo.getPage().getNum(),pageInfo.getPage().getSize());
    }
}
