package com.nobug.ribbon.test.service;

import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author yangjian
 * @Data 2019/4/26
 */
@Service
public class HelloService {

    public String sayHello(){
        return "Hello ribbon";
    }

}