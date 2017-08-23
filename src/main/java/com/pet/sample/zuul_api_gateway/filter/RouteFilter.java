/**
 * @project zuul-api-gateway
 * @file RouteFilter.java
 * @package com.pet.sample.zuul_api_gateway.filter
 * @date 2017年8月22日下午3:56:03
 * @copyright 民加科风信息技术有限公司 
 *
 */

package com.pet.sample.zuul_api_gateway.filter;

import com.netflix.zuul.ZuulFilter;

public class RouteFilter extends ZuulFilter {

  @Override
  public Object run() {
    System.out.println("Inside Route Filter");
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
    return "route";
  }

}
