package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${name}")
    private String name;

    @Autowired
    private Environment env;
    @Autowired
    private Person person;

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);

        System.out.println("======================");

        System.out.println(env.getProperty("person2.name"));

        System.out.println("===========================");
        System.out.println(person);
        return "hello";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot 2";
    }

}
