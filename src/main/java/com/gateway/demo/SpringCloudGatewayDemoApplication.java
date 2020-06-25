package com.gateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gateway.demo.filter.AddRequestHeaderFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Configuration
public class SpringCloudGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayDemoApplication.class, args);
	}
	
	@Bean
	public AddRequestHeaderFilter addRequestHeaderFilter() {
		return new AddRequestHeaderFilter();
	}
}

