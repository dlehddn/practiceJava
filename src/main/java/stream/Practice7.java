package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice7 {

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("cat", "dog", "elephant", "rabbit", "dog", "cat");
        // 동물 이름을 길이에 따라 그룹화하고 같은 길이의 동물들을 쉼표로 연결하여 맵에 저장

        Map<Integer, String> collect = animals.stream()
                .collect(Collectors.groupingBy(s -> s.length(),
                        Collectors.mapping(s -> s, Collectors.joining(", "))));

        collect.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
