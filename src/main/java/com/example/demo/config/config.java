package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class config {

    @SuppressWarnings("removal")
	@Bean
      SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .csrf()
        .disable()
        .authorizeHttpRequests(authz -> authz .anyRequest().authenticated()).httpBasic(Customizer.withDefaults())
        .cors(Customizer.withDefaults())

        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.NEVER);
        return http.build();
    }
    
}