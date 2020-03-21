package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedService {

    private HelloWorldService helloWorldService;


    @Autowired
    public ConstructorBasedService(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }
    public void getMessage(){
        helloWorldService.sayHello();
    }


}
