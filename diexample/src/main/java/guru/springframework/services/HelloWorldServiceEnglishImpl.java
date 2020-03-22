package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default") //this is used when there is multiple beans
// and the bean profile to be used will be indicated in the application properties
// we can also set one of the bean profiles to default by using keyword "default"...
// in this case, this component is our default profile...
//when you do not set an active profile in the application properties, the default one kicks in,
// however if you set an active profile in the ap, the active one overwrites the default
// you can also pass a list of profiles with the default profile e.g @Profile({"default", "english"})
// ... so the bean is active as a default bean and also as an english bean

public class HelloWorldServiceEnglishImpl implements HelloWorldService {

    @Override
    public String  getGreeting(){
        return "Hello World";
    }
}
