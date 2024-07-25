package com.example.springoauth.springoauth.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfiguration{

    //Can be used if you want to authenticate the service with gihub
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
       return http.authorizeHttpRequests(auth ->{
            auth.anyRequest().authenticated();
        }).oauth2Login(Customizer.withDefaults()).build();

       // http.build();
    }
}
