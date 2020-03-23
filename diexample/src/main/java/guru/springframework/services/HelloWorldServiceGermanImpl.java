package guru.springframework.services;

import org.springframework.context.annotation.Bean;


public class HelloWorldServiceGermanImpl implements HelloWorldService {

    @Override
    public String getGreeting(){
        return "Gute Monge!!!";
    }
}
