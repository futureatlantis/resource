package com.nobug.ribbon.comsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient    //注册服务
@EnableCircuitBreaker  //断路器
public class RibbonComsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonComsumerApplication.class, args);
	}

	@Bean
	@Autowired
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
