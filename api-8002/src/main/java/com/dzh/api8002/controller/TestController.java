package com.dzh.api8002.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 86175
 * @description :
 * @date : 2021/6/24
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "8002";
    }

}
