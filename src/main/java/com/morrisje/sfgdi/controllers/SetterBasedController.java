package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {

    private GreetingService greeting;

    @Autowired
    public void setGreeting(GreetingService greeting) {
        this.greeting = greeting;
    }
    public String getGreeting() {
        return greeting.sayGreeting();
    }
}
