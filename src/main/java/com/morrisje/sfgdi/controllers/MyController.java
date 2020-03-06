package com.morrisje.sfgdi.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello John");


        return "Hello Folks!";
    }
}
