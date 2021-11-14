package com.example.demospringbootproject3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorOnConsole {
    // Calculator: Addition, Subtraction, Multiplication, Division
@RequestMapping("/addd")
    public void Addition(){
        int a = 54;
        int b = 45;
        int result = a+b;
        System.out.println("Result by adding of a and b is= "+ result);
    }
    @RequestMapping("/subd")
    public void Subtraction(){
        int a= 54;
        int b= 21;
        int result = a-b;
        System.out.println("Result by subtraction of a and b  is ="+ result);
    }
    @RequestMapping("/multid")
    public void Multiplication(){
        int a = 54;
        int b = 21;
        int result = a*b;
        System.out.println("Result by multiply of a and b is ="+ result);
    }
    @RequestMapping("/divd")
    public void Division(){
        int a = 80;
        int b = 2;
        int result = a/b;
        System.out.println("Result by dividing of a and b is ="+ result);
    }
}
