package guru.springframework;

import guru.springframework.controllers.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {

      SpringApplication.run(SpringmvcApplication.class, args);

    }
}
