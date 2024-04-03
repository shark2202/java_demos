//package main.java;
package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@RestController
@SpringBootApplication
public class myApp extends SpringBootServletInitializer{
   @RequestMapping("/")
   String home(){
       return "hello world!";
   }

    public static void main(String[] args){
        //SpringApplication.run(myApp.class, args);
        SpringApplication.run(myApp.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        //指定 @SpringBootApplication 所在类
        return application.sources(myApp.class);
    }
}
