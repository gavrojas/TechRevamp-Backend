package com.techrevamp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Le decimos a springboot que vamos a utilizar
@Configuration
public class CorsConfig {
  
  @Bean
  public WebMvcConfigurer corsConfigurer(){
    return new WebMvcConfigurer() {
      public void addCorsMapping(CorsRegistry registry) {
        registry.addMapping("/api/v1/**")
                .allowedOrigins("http://localhost:4000")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
      }
    };
  }
}
