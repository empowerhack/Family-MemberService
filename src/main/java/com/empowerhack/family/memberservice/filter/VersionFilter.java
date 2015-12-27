package com.empowerhack.family.memberservice.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public final class VersionFilter implements Filter  {

    @Value("${version}")
    protected String version;

    protected FilterConfig filterConfig;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse responseAddition = (HttpServletResponse) response;

        responseAddition.addHeader("X-Application-Version", this.version);

        chain.doFilter(request,responseAddition);
    }

    @Override
    public void destroy() {

    }
}
