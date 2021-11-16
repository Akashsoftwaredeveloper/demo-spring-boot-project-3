package com.example.demospringbootproject3.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListControllerWithParam {

    List<String>  listOfString = new ArrayList<>();

    // CRUD operation c- create, R-read/insert, U-Update, D- Delete.

    // C- Create operation
@RequestMapping("/create/{name}")
    public String addToString(@PathVariable String name ){
    listOfString.add(name);
    return "object is added to the list ";
    }
    // R- Read / get operation
    @RequestMapping("/read")
    public List<String> get_list() {
        return listOfString;
    }
        // U- Update
    @RequestMapping("/updated/{nam}")
    public String UpdateList(@PathVariable String nam){
    listOfString.add(nam);
    return "Object is updated successfully";
    }
    // D- delete
    @RequestMapping("/deleted")
    public String Deleted(){
        listOfString.remove(0);
        return "objected is deleted successfully";
    }



}
