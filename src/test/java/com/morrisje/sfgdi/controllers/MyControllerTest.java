package com.morrisje.sfgdi.controllers;

import com.morrisje.sfgdi.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    MyController controller;
    @BeforeEach
    void setUp() {
        controller = new MyController(new PrimaryGreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello() + " ---> Default Controller");
    }
}