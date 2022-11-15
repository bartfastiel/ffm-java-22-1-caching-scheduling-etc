package com.example.ffmjava221caching;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class CarService {

    private static final String CACHE_KEY = "SOUND_CACHE";

    @Cacheable(CACHE_KEY)
    public String makeSound() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(7));

        return "Wrrooom";
    }
}
