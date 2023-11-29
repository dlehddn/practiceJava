package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "fun", "to", "learn");

        String collect = words.stream()
                .collect(Collectors.joining(" "));

        System.out.println(collect);
    }

}
