package guru.springframework.controllers;


import guru.springframework.services.HelloWorldRussianImpl;
import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceGermanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceGerman;

    //setter based dependency injection
    @Autowired
    public void setHelloWorldService (HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldServiceGerman")
    // the default behaviour of spring in the JAVA config is to name the beans the name of the method
    // that declares it
    public void setHelloWorldServiceGerman (HelloWorldService helloWorldServiceGerman){
        // we are doing this to autowire multiple beans so the controller class can run methods of two different two beans
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }


    public String sayHello(){

        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());

        return greeting;
    }
}
