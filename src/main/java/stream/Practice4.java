package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice4 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Mango", "Peach");

        List<String> collect = fruits.stream()
                .filter(s -> s.charAt(0) == 'A')
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        collect.forEach(s -> System.out.println(s));

    }
}
