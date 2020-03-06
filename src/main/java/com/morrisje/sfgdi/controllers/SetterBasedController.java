package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.GreetingService;

public class SetterBasedController {
    private GreetingService greeting;

    public void setGreeting(GreetingService greeting) {
        this.greeting = greeting;
    }
    public String getGreeting() {
        return greeting.sayGreeting();
    }
}
