package sfg.learning.sfgdi.controllers;

import sfg.learning.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.sayGreeting();
    }
}
