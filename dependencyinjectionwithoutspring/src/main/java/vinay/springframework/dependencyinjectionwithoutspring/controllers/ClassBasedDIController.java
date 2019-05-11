package vinay.springframework.dependencyinjectionwithoutspring.controllers;

import vinay.springframework.dependencyinjectionwithoutspring.services.GreetingService;

public class ClassBasedDIController {
    private GreetingService greetingService;

    public ClassBasedDIController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayHello();
    }
}
