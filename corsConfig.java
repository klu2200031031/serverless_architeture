package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:3000",   // ✅ React dev server
                        "*"                       // ✅ Allow from anywhere (needed for API Gateway / CloudFront)
                )
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}
