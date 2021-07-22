package com.revature.characterapp.filters;

import org.springframework.stereotype.*;
import org.springframework.web.filter.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@Component
public class CorsFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        //We are allowing every type of access from various ports
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        //We are allowing POST and GET requests to come in
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET");
        //We are allowing headers Content-Type and Authorization through
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        //We are exposing all headers?!
        httpServletResponse.setHeader("Access-Control-Expose-Headers", "*");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
