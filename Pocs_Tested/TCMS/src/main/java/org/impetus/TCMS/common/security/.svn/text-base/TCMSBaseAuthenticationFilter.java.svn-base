package org.impetus.TCMS.common.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;

public class TCMSBaseAuthenticationFilter 
    extends org.springframework.security.web.authentication.www.BasicAuthenticationFilter {

 public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

     final HttpServletRequest request = (HttpServletRequest) req;
     final HttpServletResponse response = (HttpServletResponse) res;

     String header = request.getHeader("Authorization");

     if ((header != null) && header.startsWith("Basic ")) {
         super.doFilter(req, res, chain);
     } else {
         getAuthenticationEntryPoint().commence(request, response, new AuthenticationCredentialsNotFoundException("Missing credentials"));
     }
 }



}
