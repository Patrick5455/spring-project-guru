package springboot;

import guru.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication

//Component Scan with java config
//@ComponentScan("guru.springframework")

// annotating with @ComponentScan, Springboot scans through the guru.springframework package to manage our beans
// the @ComponentScan becomes important to annotate because the springboot application
// is in another package outside of the guru.springframework package

//Component Scan with xml
@ImportResource("classpath:/spring/spring-config.xml")

//when you use the @ImportResource xml annotation, in its parameter, you would specify the
// classpath of the xml configuration as a string object.
//by doing this, you are telling spring to look for its component scan there
public class DiApplication {

    public static void main(String[]  args) {

       ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

        GreetingController controller =  (GreetingController) ctx.getBean("greetingController");

        controller.sayHello();
    }

}
