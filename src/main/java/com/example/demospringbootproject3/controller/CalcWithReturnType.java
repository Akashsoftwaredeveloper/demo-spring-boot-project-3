package com.example.demospringbootproject3.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcWithReturnType {
    // Calculator:  Addition ,Subtraction, Multiplication, Division

    // Addition method
    @RequestMapping("/add/{a}/{b}")
    public int Addition(@PathVariable int a,@PathVariable int b){
        int sum= a+b;
        return sum;
    }
    // subtraction method
    @RequestMapping("/sub/{a}/{b}")
    public int Subtraction(@PathVariable int a,@PathVariable int b){
        int minus= a-b;
        return minus;
    }
    // Multiplication method
    @RequestMapping("/multi/{a}/{b}")
    public int Multiplication(@PathVariable int a,@PathVariable int b){
        int multi=a*b;
        return multi;
    }
    // Division method
    @RequestMapping("/div/{a}/{b}")
    public int Division (@PathVariable int a,@PathVariable int b){
        int divide= a/b;
        return divide;
    }
}
