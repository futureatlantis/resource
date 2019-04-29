package com.nobug.feign.test.service;

import com.nobug.feign.test.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author yangjian
 * @Data 2019/4/26
 */
@Service
public class HelloService {

    // 注入RPC
    @Autowired
    private GetHello getHello;

    public String sayHello(){
        return getHello.sayHello();
    }

}