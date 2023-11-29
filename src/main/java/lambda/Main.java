package lambda;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        TestFunctional test = (a, b) -> a + b;
        System.out.println(test.max(0, 10));

        String a = "지역 변수";
        //Runnable
        execute(() -> System.out.println(a));

        //참조 변수로
        Runnable runnable2 = () -> System.out.println("Run2!");
        runnable2.run();

    }

    static void execute(Runnable runnable) {
        runnable.run();
    }
}
