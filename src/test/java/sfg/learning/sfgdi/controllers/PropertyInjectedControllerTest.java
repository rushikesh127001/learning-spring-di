package sfg.learning.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfg.learning.sfgdi.services.PropertyInjectedGreeting;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new PropertyInjectedController();
        controller.greetingService=new PropertyInjectedGreeting();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}