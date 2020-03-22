package guru.springframework.javaconfig;


// We are using this class as a java configuration for our beans
//now that we are using a java configuration for our beans,
// we do not need the annotations (@components, @profiles, etc.) in the respective
// bean class. All of that would be done here.
// however instead of @Component as we did in the bean classes,  we will use @Bean...
// we will still use @Profile for our profiling to tell spring which bean to run as indicated in application properties


import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//we will tell spring to use this class for bean configuration
// by annotating the class as a configuration.
// This would tell spring that the class is a configuration class.
public class HelloConfig {

    @Bean
    //this tells spring that this is a bean configuration
    @Profile({"default", "english"})
    public HelloWorldService helloWorldServiceEnglish (){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    //this tells spring that this is a bean configuration
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return  new HelloWorldSpanishImpl();
    }



}
