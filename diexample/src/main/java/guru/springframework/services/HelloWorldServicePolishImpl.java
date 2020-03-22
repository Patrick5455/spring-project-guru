package guru.springframework.services;

import java.security.PublicKey;

public class HelloWorldServicePolishImpl implements HelloWorldService {

    @Override
    public String getGreeting(){
        return "greet Polish";
    }
}
