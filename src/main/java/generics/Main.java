package generics;

public class Main {

    public static void main(String[] args) {

        GenericsMethod<String> gm = new GenericsMethod();
        gm.<Integer>printClassName(1);
        gm.printClassName(1.5);
    }
}
