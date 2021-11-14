package com.example.demospringbootproject3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ListController {
    List<String> stringList= new ArrayList<>();

    //CRUD= C-Create/insert, R-Return, U-Update, D-delete
    @RequestMapping("/Add")
    public String addList(){
        stringList.add("Java");
        return "Object is successfully added to the list";
    }
    @RequestMapping("/get")
    // R-Return/ get
    public List<String> getStringList(){
        return stringList;
    }
    @RequestMapping("/update")
    // u- update List
    public String updateList(){
        stringList.add(0,"Spring");
        return "Object is updated successfully";
    }
    @RequestMapping("/remove")
    // D-Delete
    public   String deleteObject(){
        stringList.remove(0);
        return"Object is deleted successfully";
    }



}
