package vinay.springframework.dependencyinjectionwithoutspring.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import vinay.springframework.dependencyinjectionwithoutspring.services.GreetingServiceImpl;

public class SetterBasedDIControllerTest {
    private SetterBasedDIController setterBasedDIController;

    @Before
    public void setUp() throws Exception{
        setterBasedDIController = new SetterBasedDIController();
        setterBasedDIController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void test() throws Exception{
        Assert.assertEquals(GreetingServiceImpl.SAY_HELLO,setterBasedDIController.hello());
    }
}
