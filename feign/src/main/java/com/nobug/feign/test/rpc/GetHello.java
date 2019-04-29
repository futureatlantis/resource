package com.nobug.feign.test.rpc;

import com.nobug.feign.test.rpc.failure.GetHelloFailure;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @Author yangjian
 * @Data 2019/4/26
 */
//注入 RPC
@FeignClient(value = "ribbon-consumer-serivce",fallback = GetHelloFailure.class)
public interface GetHello {

    @RequestMapping(value = "/hello?name=feign",method = RequestMethod.GET)
    public String sayHello();

}