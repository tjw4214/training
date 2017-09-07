package com.woodmen.hello.controller;

import com.woodmen.hello.domain.Hello;
import com.woodmen.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello/{name}")
    public Hello sayHello(@PathVariable("name") String name) {
        return helloService.helloWorld(name);
    }
}
