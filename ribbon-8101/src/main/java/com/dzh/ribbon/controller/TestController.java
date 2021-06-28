package com.dzh.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : 86175
 * @description :
 * @date : 2021/6/24
 */
@RestController
@RequestMapping("/ribbon")
public class TestController {

    private static final String REST_URL_PREFIX = "http://API";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String hello(){
        return restTemplate.postForObject(REST_URL_PREFIX + "/test/hello", null, String.class);
    }

}
