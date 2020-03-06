package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting() + " Constructor Based");
    }
}