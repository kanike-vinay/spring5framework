package vinay.springframework.dependencyinjectionwithoutspring.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String SAY_HELLO = "Hello World !!";
    @Override
    public String sayHello() {
        return SAY_HELLO;
    }
}
