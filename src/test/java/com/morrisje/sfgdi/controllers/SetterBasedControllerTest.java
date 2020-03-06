package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterBasedController controller;


    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreeting(new ConstructorGreetingServiceImpl());



    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}