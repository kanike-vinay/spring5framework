package vinay.springframework.dependencyinjectionusingspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Servicio de Saludo Primario";
    }
}
