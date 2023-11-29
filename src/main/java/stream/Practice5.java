package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice5 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 7, 5, 9, 2, 8);

        Integer integer = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElse(-1);

        System.out.println(integer);
    }
}
