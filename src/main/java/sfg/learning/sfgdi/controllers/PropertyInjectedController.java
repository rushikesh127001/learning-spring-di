package sfg.learning.sfgdi.controllers;

import sfg.learning.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
