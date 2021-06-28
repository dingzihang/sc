package com.dzh.api8001.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 86175
 * @description :
 * @date : 2021/6/24
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "8001";
    }

}
