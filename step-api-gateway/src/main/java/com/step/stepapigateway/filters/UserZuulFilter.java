package com.step.stepapigateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class UserZuulFilter  extends ZuulFilter {
    @Override
    public boolean shouldFilter() {
        return true; // 该过滤器需要执行
    }

    @Override
    public Object run() { //编写业务逻辑
        RequestContext requestContext = RequestContext.getCurrentContext();
        //        requestContext.setSendZuulResponse(false); // 过滤该请求，不对其进行路由
        //        requestContext.setResponseStatusCode(401); // 设置响应状态码
        return null;
    }

    @Override
    public String filterType() {
        return "pre"; // 设置过滤器类型为：pre
    }

    @Override
    public int filterOrder() {
        return 0;// 设置执行顺序
    }
}
