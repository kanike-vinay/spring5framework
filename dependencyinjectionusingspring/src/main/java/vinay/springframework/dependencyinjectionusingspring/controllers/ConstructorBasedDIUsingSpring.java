package vinay.springframework.dependencyinjectionusingspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vinay.springframework.dependencyinjectionusingspring.services.GreetingService;

@Controller
public class ConstructorBasedDIUsingSpring {
    public GreetingService greetingService;

    @Autowired //This is not required in Spring 4.2 version and above. As constructor are auto wired.
    public ConstructorBasedDIUsingSpring(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayHello();
    }
}
