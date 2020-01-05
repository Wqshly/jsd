package com.wqs.jsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wan
 * @Date: Created in 14:41 2019/12/25
 * @Description:
 * @Modified By:
 */
@Controller
public class TestController {
    @GetMapping("/hello")
    @ResponseBody
    public String getHello() {
        return "hello Spring Boot";
    }
}
