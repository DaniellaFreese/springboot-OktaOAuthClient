package com.okta.spring.OktaOAuthClient;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class RestControllerExample {
    
    @GetMapping("/hello")
    public String hello(){

        return "hey!"; 
    }

    @GetMapping("/check")
    public String checkSession(HttpServletRequest request) {
        String id = request.getSession().getId();
        SecurityContext securityContext = (SecurityContext) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        DefaultOidcUser principal = (DefaultOidcUser) securityContext.getAuthentication().getPrincipal();
        String idtoken = principal.getIdToken().getTokenValue();
        return "sesion id: " + id + "access token in session: " + idtoken;
    }

}
