package vinay.springframework.dependencyinjectionusingspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vinay.springframework.dependencyinjectionusingspring.services.GreetingService;

@Controller
public class SetterBasedDIUsingSpring {
    public GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayHello();
    }
}
