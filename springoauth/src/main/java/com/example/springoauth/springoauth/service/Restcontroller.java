package com.example.springoauth.springoauth.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Restcontroller {
    

    @GetMapping("/home")
    public String getMethodName() {
        org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    
    if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
        UserDetails u1 = (UserDetails) authentication.getPrincipal();

        System.out.println("u1 username" + u1.getUsername());
    }
    
   
        return new String("YEs this is secured ");
    }
    
}
