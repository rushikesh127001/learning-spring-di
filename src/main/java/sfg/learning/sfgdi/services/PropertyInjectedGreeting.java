package sfg.learning.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreeting implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World-- Property";
    }
}
