package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreeting() {

        // Least Preferred
        System.out.println(controller.getGreeting() + "Least preferred");
    }
}