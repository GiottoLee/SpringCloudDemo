package com.spring.cloud.demo.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WebAdminRibbonApplication {
    //第一个参数WebAdminRibbonApplication.class就是Spring应用的入口类；
    // 第二个参数args是启动Spring应用的命令行参数，该参数可以在Spring应用中被访问
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
