package generics;

public class GenericsMethod<T> {
    public <T> void printClassName(T t) {
        System.out.println(t.getClass().getName());
    }

    public GenericsMethod() {
    }
}
