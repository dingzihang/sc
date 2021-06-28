package com.dzh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/**
 * @EnableEurekaServer
 * 没有此注解即使启动成功也打不开eureka管理页面
 */
@EnableEurekaServer
public class Eureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Application.class, args);
    }

}
