package com.wqs.jsd.service.impl;

import com.wqs.jsd.service.*;
import org.springframework.stereotype.Service;

/**
 * @Author:
 * @Date: Created in 16:01 2020/3/1
 * @Description:
 * @Modified By:
 */
@Service
public class PCTypeFactory implements PortTypeFactory {
    @Override
    public BasicCodingService getBasicCoding() {
        return new PCBasicCodingServiceImpl();
    }

    @Override
    public DivisionService getDivision() {
        return new PCDivisionServiceImpl();
    }

    @Override
    public MaterielService getMateriel() {
        return null;
    }

    @Override
    public OrderTypeService getOrderType() {
        return null;
    }

    @Override
    public PostService getPost() {
        return new PCPostServiceImpl();
    }

    @Override
    public StaffService getStaff() {
        return new PCStaffServiceImpl();
    }

    @Override
    public StaffUserService getStaffUser() {
        return new PCStaffUserServiceImpl();
    }
}
