package com.wqs.jsd.service;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.BasicCoding;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 9:26 2020/1/13
 * @Description:
 * @Modified By:
 */
@Service
public interface BasicCodingService {

    ResultBean<Void> insertBasicCodingRecord(BasicCoding basicCoding);

    ResultBean<List<BasicCoding>> findBasicCodingByType(String s);
}
