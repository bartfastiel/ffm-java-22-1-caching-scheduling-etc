package com.example.ffmjava221caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FfmJava221CachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FfmJava221CachingApplication.class, args);
    }

}
