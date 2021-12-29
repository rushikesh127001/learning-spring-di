package sfg.learning.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.learning.sfgdi.services.GreetingService;

@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}