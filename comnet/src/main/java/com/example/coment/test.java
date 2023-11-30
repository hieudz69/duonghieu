package com.example.coment;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("/hello")
    public String helloSpringBoot() {
        return "Hello Spring Boot";
    }

}
