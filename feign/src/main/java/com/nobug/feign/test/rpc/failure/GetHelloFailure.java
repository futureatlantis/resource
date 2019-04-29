package com.nobug.feign.test.rpc.failure;

import com.nobug.feign.test.rpc.GetHello;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author yangjian
 * @Data 2019/4/26
 */
@Component
public class GetHelloFailure implements GetHello{

    @Override
    public String sayHello(){
        return "service is not available !";
    }
}