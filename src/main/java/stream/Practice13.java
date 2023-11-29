package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice13 {

    public static void main(String[] args) {
        // 주어진 문자열 리스트에서 'a'로 시작하는 단어들을 대문자로 바꾼 후 정렬된 리스트 생성
        List<String> words = Arrays.asList("apple", "banana", "apricot", "avocado");

        List<String> collect = words.stream()
                .filter(w -> w.charAt(0) == 'a')
                .map(w -> w.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        collect.forEach(w -> System.out.println(w));
    }





}
