package com.springboot.app.SPTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    //get
    //post
    //put
    //delete

    //GET HTTP Method
    //http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
