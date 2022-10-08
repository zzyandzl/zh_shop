package com.zl.utils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
        String servletPath = request.getServletPath();
        if(("/index.jsp").equals(servletPath) ||
                ("/user/login").equals(servletPath) || ("/user/exit").equals(servletPath) ||
                session != null && session.getAttribute("user") != null){
            chain.doFilter(request,response);
        }else{
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
