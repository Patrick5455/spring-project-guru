package guru.springframework.controllers;


import guru.springframework.services.HelloWorldRussianImpl;
import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceGermanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller
// we comment out @Controller when we switch to xml-based bean config from java-based bean config
public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceGerman;

    private HelloWorldService HelloWorldServiceFrench;


    //setter based dependency injection
    @Autowired
    //DEPENDECY INJECTION BY (INTERFACE) TYPE
    public void setHelloWorldService (HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldServiceGerman")
    // the default behaviour of spring in the JAVA config is to name the beans the name of the method
    // that declares it

    //DEPENDECY INJECTION BY (bean method) NAME
    public void setHelloWorldServiceGerman (HelloWorldService helloWorldServiceGerman){
        // we are doing this to autowire multiple beans so the controller class can run methods of two different two beans
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    @Qualifier("french")
    // here instead of using the name of the method that declares the bean,
    // we are using the name of the bean which we have specified with the (name = "french") in our config class

    //DEPENDECY INJECTION BY (bean) NAME
    public void setHelloWorldServiceFrench (HelloWorldService HelloWorldServiceFrench){
        this.HelloWorldServiceFrench = HelloWorldServiceFrench;
    }


    public String sayHello(){

        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(HelloWorldServiceFrench.getGreeting());

        return greeting;
    }
}
