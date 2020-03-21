package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

// simple hello world -- no @Autowired
//        HelloWorldimpl  helloWorld  = (HelloWorldimpl) ctx.getBean("helloWorld");
//        helloWorld.sayHello();

        ConstructorBasedService constructorService = (ConstructorBasedService) ctx.getBean("constructorBasedService");

        constructorService.getMessage();

        SetterBasedService basedService = (SetterBasedService) ctx.getBean("setterBasedService");

        basedService.getMessage();
    }
}
