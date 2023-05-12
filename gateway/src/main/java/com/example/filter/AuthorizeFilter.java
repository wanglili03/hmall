package com.example.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author lijinwang
 * @date 2023/5/10
 * @apiNote
 */
@Order(-1)
@Component
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1、获取请求参数
        MultiValueMap<String, String> params = exchange.getRequest().getQueryParams();
        //2、获取authorization参数
        String authorization = params.getFirst("authorization");
        //3、校验
        if("admin".equals(authorization)){
            //放行
            return chain.filter(exchange);
        }
        //4、拦截
        //4.1禁止访问，设置转态码
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        //4.2结束访问
        return exchange.getResponse().setComplete();
    }
}
