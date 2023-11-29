package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice12 {

    public static void main(String[] args) {

        // 주어진 문자열 리스트에서 각 단어의 길이를 맵으로 만들기
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        Map<String, Integer> collect = words.stream()
                .collect(Collectors.toMap(w -> w, w -> w.length()));

        collect.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
