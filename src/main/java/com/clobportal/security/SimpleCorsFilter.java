package com.clobportal.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
/*@Profile("dev")*/
public class SimpleCorsFilter implements Filter {

    public SimpleCorsFilter() {

        log.info("Statring cors");
    }
    @Override
    public void init(FilterConfig filterConfig) {
        log.info("initializing corss..........");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT,PATCH");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, authorization, content-type");
        
        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            chain.doFilter(req, res);
        }
    }



    @Override
    public void destroy() {
    }
}