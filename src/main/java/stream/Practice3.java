package stream;

import java.util.Arrays;
import java.util.List;

public class Practice3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList();

        double v = numbers.stream()
                .mapToDouble(num -> num)
                .average()
                .orElse(-1);
        System.out.println(v);

        int sum = numbers.stream()
                .mapToInt(num -> num * num)
                .sum();

        System.out.println(sum);
    }
}
