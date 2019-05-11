package vinay.springframework.dependencyinjectionwithoutspring.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import vinay.springframework.dependencyinjectionwithoutspring.services.GreetingServiceImpl;

public class ClassBasedDIControllerTest {
    private ClassBasedDIController classBasedDIController;

    @Before
    public void setUp() throws Exception{
        classBasedDIController = new ClassBasedDIController(new GreetingServiceImpl());
    }

    @Test
    public void test() throws Exception{
        Assert.assertEquals(GreetingServiceImpl.SAY_HELLO,classBasedDIController.hello());
    }
}
