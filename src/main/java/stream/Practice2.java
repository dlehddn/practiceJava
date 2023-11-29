package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice2 {

    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Japan", "Korea", "USA", "China", "Canada");

        Map<Integer, List<String>> collect = countries.stream()
                .collect(Collectors.groupingBy(c -> c.length()));

        collect.forEach((k, v) -> System.out.println(k + ": " + v.toString()));


    }
}
