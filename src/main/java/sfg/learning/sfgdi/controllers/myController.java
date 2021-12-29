package sfg.learning.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class myController {
    public String myFunc(){
        System.out.println("Hello World");
        return "Heyy!";
    }
}
