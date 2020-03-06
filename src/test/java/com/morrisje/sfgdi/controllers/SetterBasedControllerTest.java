package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

    SetterBasedController controller;


    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreeting(new GreetingServiceImpl());



    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}