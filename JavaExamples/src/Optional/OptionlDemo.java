package Optional;

import java.util.Optional;

public class OptionlDemo {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("");
        name.ifPresent(System.out::println);
    }

}
