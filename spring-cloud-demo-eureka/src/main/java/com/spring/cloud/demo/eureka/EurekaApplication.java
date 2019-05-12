/*服务发现框架
Eureka Server提供服务注册服务，各个节点启动后，会在Eureka Server中进行注册，这样
EurekaServer中的服务注册表中将会存储所有可用服务节点的信息，服务节点的信息可以在界面中直观的看到。*/
package com.spring.cloud.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {                //服务发现框架，实现负载均衡
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
