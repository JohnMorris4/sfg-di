package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreetingService() {
        return greetingService.sayGreeting();
    }
    public String sayHello(){ return greetingService.sayGreeting(); }
}
