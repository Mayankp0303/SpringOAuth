package com.example.springoauth.springoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.oauth2.client.OAuth2ClientSecurityMarker;

@SpringBootApplication
@EnableWebSecurity
public class SpringoauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringoauthApplication.class, args);
	}

}



