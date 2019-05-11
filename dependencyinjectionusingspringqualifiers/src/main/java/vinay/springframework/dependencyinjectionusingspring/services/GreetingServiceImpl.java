package vinay.springframework.dependencyinjectionusingspring.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String SAY_HELLO = "Hello World !!";

    @Override
    public String sayHello() {
        return SAY_HELLO;
    }
}
