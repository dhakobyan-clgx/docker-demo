package com.corelogic.docker.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(), "Welcome to the docker container!");
    }
}
