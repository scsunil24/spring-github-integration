package io.sunilbranch.springgithub.controller;

import io.sunilbranch.springgithub.model.GreetingMessage;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public GreetingMessage greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingMessage(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/createGreeting")
    public String createGreeting(){
        return "New Greetings created successfully";
    }

    @DeleteMapping("/deleteGreeting")
    public String deleteGreeting(){
        return "Existing Greeting was deleted";
    }

}
