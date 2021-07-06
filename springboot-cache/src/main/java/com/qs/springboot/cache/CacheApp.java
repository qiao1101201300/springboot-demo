package com.qs.springboot.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.qs.springboot.cache.mapper")
@EnableCaching
public class CacheApp {
    public static void main(String[] args) {
        SpringApplication.run(CacheApp.class);
    }
}
