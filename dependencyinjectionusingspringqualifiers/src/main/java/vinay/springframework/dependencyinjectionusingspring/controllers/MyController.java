package vinay.springframework.dependencyinjectionusingspring.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private String hello = "Hello from my controller";

    public String hello(){
        return hello;
    }
}
