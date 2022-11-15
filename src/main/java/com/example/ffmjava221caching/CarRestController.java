package com.example.ffmjava221caching;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarRestController {

    private final CarService service;

    @GetMapping
    String makeSound() throws InterruptedException {
        return service.makeSound();
    }

}
