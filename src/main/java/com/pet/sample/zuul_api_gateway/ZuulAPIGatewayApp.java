package com.pet.sample.zuul_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.pet.sample.zuul_api_gateway.filter.ErrorFilter;
import com.pet.sample.zuul_api_gateway.filter.PostFilter;
import com.pet.sample.zuul_api_gateway.filter.PreFilter;
import com.pet.sample.zuul_api_gateway.filter.RouteFilter;

@SpringCloudApplication
@EnableZuulProxy
public class ZuulAPIGatewayApp {
  
  public static void main(String[] args) {
    SpringApplication.run(ZuulAPIGatewayApp.class, args);
  }
  
  @Bean
  public PreFilter preFilter(){
    return new PreFilter();
  }
  
  @Bean
  public PostFilter postFilter(){
    return new PostFilter();
  }
  
  @Bean
  public RouteFilter routeFilter(){
    return new RouteFilter();
  }
  
  @Bean
  public ErrorFilter errorFilter(){
    return new ErrorFilter();
  }
  
}
