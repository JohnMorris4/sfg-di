package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        greetingService.sayGreeting();
    }
}
