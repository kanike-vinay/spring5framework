package vinay.springframework.dependencyinjectionwithoutspring.controllers;

import vinay.springframework.dependencyinjectionwithoutspring.services.GreetingService;

public class SetterBasedDIController {
    private GreetingService greetingService;

    public String hello(){
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
