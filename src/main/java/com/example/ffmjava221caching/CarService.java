package com.example.ffmjava221caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;

@Service
public class CarService {

    private static final String CACHE_KEY = "CACHE_KEY";
    private static final String CACHE_KEY_2 = "CACHE_KEY_2";

    @Cacheable(CACHE_KEY)
    public String makeSound(String color) throws InterruptedException {
        System.out.println("makeSound wird aufgerufen");
        Thread.sleep(Duration.ofSeconds(7));
        System.out.println("makeSound ist fertig");
        return "Wrrooom of " + color + " car " + LocalDateTime.now();
    }

    @Cacheable(CACHE_KEY_2)
    public String makeNoise() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));

        return "Neeeaaauuu";
    }

    @CacheEvict({CACHE_KEY, CACHE_KEY_2})
    public String clearCache() {
        return "Caches cleared";
    }
}
