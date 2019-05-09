package com.nobug.ribbon.comsumer.test.controller;

import com.nobug.ribbon.comsumer.test.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author yangjian
 * @Data 2019/4/26
 */
@RestController
@Api("用户接口")
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/hello")
    @ApiOperation(value="普通的登录方法", notes="登录")
    @ApiImplicitParam(name = "name", value = "登录信息", required = true, dataType = "String")
    public String sayHello(String name){
        return helloService.sayHello() + " " + name;
    }
}