package java_17.Functional_Interfaces;

@FunctionalInterface
public interface WelcomeInterface {
    public void welcomeMessage();

    default public void welcomeMessage2(){
        System.out.println("Default method can be overridden by classes");
    }

        static public void welcomeMessage3(){
        System.out.println("static method can not be overridden by classes");
    }
}
