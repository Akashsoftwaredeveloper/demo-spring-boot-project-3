package com.example.demospringbootproject3.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcReturnTypeMapping {
    // Calculator: Addition, Subtraction, Multiplication, Division,
    @RequestMapping("/addf")
    public int addition(@RequestParam int a, @RequestParam int b){
        return a+b;
    }
    @RequestMapping("/subf")
    public int Subtraction(@RequestParam int a, @RequestParam int b){
        return a-b;
    }
    @RequestMapping("/multf")
    public int Multiplication(@RequestParam int a, @RequestParam int b){
        return a*b;
    }
    @RequestMapping("/divf")
    public int division(@RequestParam int a, @RequestParam int b){
        return a/b;

    }
}
