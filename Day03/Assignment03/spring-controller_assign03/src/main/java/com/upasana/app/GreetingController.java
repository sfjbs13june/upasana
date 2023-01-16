package com.upasana.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String SayGreet()
    {
        return "Greetings from App!";
    }

    @GetMapping("/welcome")
    public String SayWelcome()
    {
        return "Welcome from App!";
    }

    @GetMapping("/hi")
    public String SayHi()
    {
        return "Hie from App!";
    }

    @GetMapping("/thanks")
    public String SayThanks()
    {
        return "Thanks from App!";
    }


}
