package vinay.springframework.dependencyinjectionusingspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vinay.springframework.dependencyinjectionusingspring.controllers.ConstructorBasedDIUsingSpring;
import vinay.springframework.dependencyinjectionusingspring.controllers.MyController;
import vinay.springframework.dependencyinjectionusingspring.controllers.ParameterBasedDIUsingSpring;
import vinay.springframework.dependencyinjectionusingspring.controllers.SetterBasedDIUsingSpring;

@SpringBootApplication
public class DependencyinjectionusingspringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyinjectionusingspringApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("MyContoller :: " + myController.hello());

        System.out.println("ConstructorBasedDIUsingSpring :: " + ctx.getBean(ConstructorBasedDIUsingSpring.class).hello());
        System.out.println("SetterBasedDIUsingSpring :: " + ctx.getBean(SetterBasedDIUsingSpring.class).hello());
        System.out.println("ParameterBasedDIUsingSpring :: " + ctx.getBean(ParameterBasedDIUsingSpring.class).hello());
    }

}
