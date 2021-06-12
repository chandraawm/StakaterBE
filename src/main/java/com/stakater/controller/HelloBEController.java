package com.stakater.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBEController  {
    
   
    @Value("${Name}")
    private String Name;
    
    @GetMapping("/displayHello")
    public String dispalyHello() {

        return "Hello " + Name ;

    }

   

}
