package optional;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = "Woody";
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.orElse(getName()));
        System.out.println(optional.orElseGet(() -> getName()));
    }
    private static String getName() {
        System.out.println("메소드 호출");
        return "값이 없습니다.";
    }
}
