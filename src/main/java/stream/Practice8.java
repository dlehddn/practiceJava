package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice8 {
    public static void main(String[] args) {
        // 주어진 문자열 리스트에서 소문자로 이뤄진 단어들을 대문자로 변환한 뒤, 중복을 제거하고 정렬된 리스트를 반환해야 합니다.
        List<String> words = Arrays.asList("apple", "Banana", "ORANGE", "apple", "grapes", "banana");
        List<String> collect = words.stream()
                .map(s -> s.toUpperCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
