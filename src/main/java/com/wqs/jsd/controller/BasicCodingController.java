package com.wqs.jsd.controller;

import com.wqs.jsd.beans.ResultBean;
import com.wqs.jsd.pojo.Post;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wan
 * @Date: Created in 21:52 2020/1/11
 * @Description:
 * @Modified By:
 */
@RequestMapping("/basicCoding")
public class BasicCodingController {
    /**
     * @param
     * @description:
     * @return:
     * @author: van
     * @time: 2020/1/11 21:55
     */
    @PostMapping("findAllPost")
    public ResultBean<Void> findAllPost() {
        return new ResultBean<>();
    }
}
