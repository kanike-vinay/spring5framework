package vinay.springframework.dependencyinjectionusingspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vinay.springframework.dependencyinjectionusingspring.services.GreetingService;

@Controller
public class ParameterBasedDIUsingSpring {
    @Autowired
    @Qualifier("greetingServiceImpl") //method 1
    public GreetingService greetingService; // method 1

    //public GreetingServiceImpl greetingService; // method 2 , looks in the type and inject
    //public GreetingService greetingServiceImpl; // method 3 , looks in the name and inject (basically reflection is happening.

    public String hello(){
        return greetingService.sayHello();
    }
}
