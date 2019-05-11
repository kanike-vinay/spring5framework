package vinay.springframework.dependencyinjectionwithoutspring.controllers;

import vinay.springframework.dependencyinjectionwithoutspring.services.GreetingService;

public class PropertyInjectedDIController {
    public GreetingService greetingService;

    public String hello(){
        return greetingService.sayHello();
    }
}
