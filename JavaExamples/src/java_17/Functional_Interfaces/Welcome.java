package java_17.Functional_Interfaces;

public class Welcome implements WelcomeInterface{

    public static void main(String[] args) {

        WelcomeInterface wc = () -> System.out.println("This is coming from Functional Interface!");
        wc.welcomeMessage();
    }

// if we are implementing the interface than need to override this methos
    @Override
    public void welcomeMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'welcomeMessage'");
    }

    // Default method is also overridden
    @Override
    public void welcomeMessage2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'welcomeMessage'");
    }
    

}
