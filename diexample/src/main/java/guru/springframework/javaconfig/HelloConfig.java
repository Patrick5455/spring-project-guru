package guru.springframework.javaconfig;


// We are using this class as a java configuration for our beans
//now that we are using a java configuration for our beans,
// we do not need the annotations (@components, @profiles, etc.) in the respective
// bean class. All of that would be done here.
// however instead of @Component as we did in the bean classes,  we will use @Bean...
// we will still use @Profile for our profiling to tell spring which bean to run as indicated in application properties


import guru.springframework.services.HelloWorldFactory;
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

    // Without factory pattern
//        @Bean
//        //this tells spring that this is a bean configuration
//        @Profile({"default", "english"})
//        public HelloWorldService helloWorldServiceEnglish (){
//            return new HelloWorldServiceEnglishImpl();
//        }
//
//        @Bean
//        //this tells spring that this is a bean configuration
//        @Profile("spanish")
//        public HelloWorldService helloWorldServiceSpanish(){
//            return  new HelloWorldSpanishImpl();
//        }

    //With Factory Pattern
    @Bean
    // a method with HelloWorldFactory class as  Return Type
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    // a method with HelloWorldServiceEnglish class as  Return Type -- using polymorphism
    // it collects an HelloWorldFactory class's reference as parameter
    // to call an HelloWorldFactory method - createHelloWorldService
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish (HelloWorldFactory factory){
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public  HelloWorldService helloWorldServiceSpanish (HelloWorldFactory factory){
        return factory.createHelloWorldService("es");
    }

//    @Bean
//    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory){
//        return factory.createHelloWorldService("fr");
//    }
//
//    @Bean
//    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory){
//        return factory.createHelloWorldService("de");
//    }
//
//    @Bean
//    public HelloWorldService helloWorldServicePolish (HelloWorldFactory factory){
//        return factory.createHelloWorldService("pl");
//    }
//
//    @Bean
//    public HelloWorldService helloWorldServiceRussian (HelloWorldFactory factory){
//         return factory.createHelloWorldService("ru");
//    }
}
