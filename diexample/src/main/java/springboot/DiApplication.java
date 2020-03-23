package springboot;

import guru.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("guru.springframework")
// @ComponentScan scans through the guru.springframework package to manage our beans
// the @ComponentScan becomes important to annotate because the springboot appication
// is in another package outside of the guru.springframework package
public class DiApplication {

    public static void main(String[]  args) {

       ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

        GreetingController controller =  (GreetingController) ctx.getBean("greetingController");

        controller.sayHello();
    }

}
