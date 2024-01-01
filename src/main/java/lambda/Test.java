package lambda;

public class Test {
    public static void main(String[] args) {
        TestFunctional tf = new TestFunctional() {
            @Override
            public int max(int a, int b) {
                return Math.max(a, b);
            }
        };
        System.out.println(tf.max(1, 10));
    }
}
