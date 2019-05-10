package com.spring.cloud.demo.web.admin.ribbon.service;

//import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String message){
        return restTemplate.getForObject("http://spring-cloud-demo-service-admin/hi?message="+message,String.class);
    }

}
