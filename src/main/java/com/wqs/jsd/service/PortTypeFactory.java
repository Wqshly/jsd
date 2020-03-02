package com.wqs.jsd.service;

import com.wqs.jsd.service.*;
import org.springframework.stereotype.Service;

/**
 * @Author: wan
 * @Date: Created in 12:56 2020/3/1
 * @Description:
 * @Modified By:
 */
@Service
public interface PortTypeFactory {
    BasicCodingService getBasicCoding();
    DivisionService getDivision();
    MaterielService getMateriel();
    OrderTypeService getOrderType();
    PostService getPost();
    StaffService getStaff();
    StaffUserService getStaffUser();
}
