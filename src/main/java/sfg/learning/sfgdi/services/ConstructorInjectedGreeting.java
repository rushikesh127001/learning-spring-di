package sfg.learning.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreeting implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World--Constructor Injected";
    }
}
