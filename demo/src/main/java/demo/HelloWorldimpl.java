package demo;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 3/11/15.
 */
@Component
public class HelloWorldimpl implements  HelloWorldService {

    public void sayHello(){
        System.out.println("Hello World!!!!");
    }
}
