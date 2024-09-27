package org.example.shopping_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/user/**")
                .allowedOrigins("http://10.12.3.137:3000") // địa chỉ của frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}

