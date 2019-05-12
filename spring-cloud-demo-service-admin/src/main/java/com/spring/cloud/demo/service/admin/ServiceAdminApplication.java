package com.spring.cloud.demo.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAdminApplication {              //服务端
    public static void main(String[] args) {
        //第一个参数ServiceAdminApplication.class就是Spring应用的入口类；
        // 第二个参数args是启动Spring应用的命令行参数，该参数可以在Spring应用中被访问
        SpringApplication.run(ServiceAdminApplication.class, args);
    }
}
