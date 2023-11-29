package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {

    public static void main(String[] args) {
        // 길이가 5이상인 단어를 필터링, 해당 단어의 길이로 이루어진 리스트 생성
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        List<Integer> collect = words.stream()
                .filter(w -> w.length() >= 5)
                .map(w -> w.length())
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
