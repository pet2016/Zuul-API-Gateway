package com.pet.sample.zuul_api_gateway.filter;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {

  @Override
  public Object run() {
    System.out.println("Inside Error Filter");
    return null;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public String filterType() {
    return "error";
  }

}
