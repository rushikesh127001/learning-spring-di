package sfg.learning.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfg.learning.sfgdi.services.PropertyInjectedGreeting;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectedController(new PropertyInjectedGreeting());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}