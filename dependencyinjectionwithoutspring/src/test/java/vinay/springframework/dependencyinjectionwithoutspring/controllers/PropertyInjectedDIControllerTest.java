package vinay.springframework.dependencyinjectionwithoutspring.controllers;

import org.junit.Before;
import org.junit.Test;
import vinay.springframework.dependencyinjectionwithoutspring.services.GreetingServiceImpl;
import static org.junit.Assert.assertEquals;

public class PropertyInjectedDIControllerTest {

    private PropertyInjectedDIController propertyInjectedDIController;

    @Before
    public void setUp() throws Exception{
        propertyInjectedDIController = new PropertyInjectedDIController();
        propertyInjectedDIController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testHello() throws Exception{
        assertEquals(GreetingServiceImpl.SAY_HELLO,propertyInjectedDIController.hello());
    }
}
