package guru.springframework.services;

public class HelloWorldFactory {

    // a method with an HelloWorldService Interface Return Type
    public HelloWorldService createHelloWorldService (String language){

        HelloWorldService service = null;

        switch (language){

            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case  "pl":
                service = new HelloWorldServicePolishImpl();
                break;
            case "ru":
                service = new HelloWorldRussianImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }

        return service;
    }
}
