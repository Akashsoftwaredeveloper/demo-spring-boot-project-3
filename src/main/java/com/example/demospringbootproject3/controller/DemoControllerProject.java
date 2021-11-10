package com.example.demospringbootproject3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

     @RestController
     public class DemoControllerProject {

    // Write a method or function which will return Hello World on console
    // end point: For end point we use @RequestMapping annotation
    @RequestMapping("/message")
    public void Hello(){
        System.out.println("Hello World");
    }
    // Write a method or function which will return "Welcome to Spring boot"
         // end point
    @RequestMapping("/welcome")
         public String welcome(){
        return "Welcome to Spring Boot";
    }
}
