package com.qs.springboot.cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyCacheConfig {
    @Bean
    public KeyGenerator keyGenerator() {
        return (o, method, objects) -> method.getName() + "[" + Arrays.asList(objects) + "]";
    }
}
