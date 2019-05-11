package vinay.springframework.dependencyinjectionusingspring.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "I was injected by constructor";
    }
}
