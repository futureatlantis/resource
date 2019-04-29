package com.nobug.ribbon.comsumer.test.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author yangjian
 * @Data 2019/4/26
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;
    //，可以通过回调来阻止上述连锁调用失败的情况
    @HystrixCommand(fallbackMethod = "callFailure")
    public String sayHello(){

        String hello = restTemplate.getForObject("http://ribbon-provider-service/hello?name=zhangtaifeng", String.class);
        return hello;
    }

    /**
     * 调用失败
     * @return
     */
    public String callFailure(){
        return "service is not available!";
    }

}