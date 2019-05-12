package com.spring.cloud.demo.web.admin.ribbon.service;

//import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
//如果一个类带了@Service注解，将自动注册到Spring容器
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    //getForObject函数实际上是对getForEntity函数的进一步封装，
    // 如果你只关注返回的消息体的内容，对其他信息都不关注，此时可以使用getForObject
    //getForObject的第一个参数为我要调用的服务的地址，这里我调用了服务提供者提供的/hello接口，注意这里是通过服务名调用而不是服务地址，如果写成服务地址就没法实现客户端负载均衡了。
    //getForObject第二个参数String.class表示我希望返回的body类型是String
    //拿到返回结果之后，将返回结果遍历打印出来

    public String sayHi(String message){
        return restTemplate.getForObject("http://spring-cloud-demo-service-admin/hi?message="+message,String.class);
    }

}
