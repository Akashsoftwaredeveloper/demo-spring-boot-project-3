package com.example.demospringbootproject3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcParamOnConsole {
    // Calculator Addition, Subtraction, Multiplication, Division.
    @RequestMapping("/adds")
    public void addition (int a , int b){
        int result = a+b;
        System.out.println("Addition of a and b is ="+ result);
    }
    @RequestMapping("/subs")
    public void Subtraction(int a, int b){
        int result = a-b;
        System.out.println("Subtraction of a and b is ="+ result);
    }
    @RequestMapping("/multis")
    public void Multiplication(int a, int b){
        int result = a*b;
        System.out.println("Multiplication of a and b is ="+result);
    }
    @RequestMapping("/divs")
    public void Division(int a, int b){
        int result= a/b;
        System.out.println("Division of a and b is ="+result);
    }
}
