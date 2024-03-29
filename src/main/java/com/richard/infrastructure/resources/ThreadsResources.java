package com.richard.infrastructure.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/threads")
public class ThreadsResources {

    @GetMapping
    public String get() throws InterruptedException {
        Thread.sleep(3000);
        return "Hello Word!";
    }
}
