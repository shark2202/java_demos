//package main.java;
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class myApp {
   @RequestMapping("/")
   String home(){
       return "hello world!";
   }

    public static void main(String[] args){
        //SpringApplication.run(myApp.class, args);
        SpringApplication.run(myApp.class, args);
    }

}
