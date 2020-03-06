package com.morrisje.sfgdi.controllers;


import com.morrisje.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        // System.out.println("Hello John");


        return greetingService.sayGreeting();
    }
}
