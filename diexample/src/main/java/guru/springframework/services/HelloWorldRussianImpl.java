package guru.springframework.services;

public class HelloWorldRussianImpl implements  HelloWorldService{

    @Override
    public String getGreeting(){
        return "Russian XYZ";
    }
}
