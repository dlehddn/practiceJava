package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice10 {

    public static void main(String[] args) {
        // 문자열 리스트에서 길이가 3 이상인 단어들을 거꾸로 뒤집은 후 콤마로 연결된 하나의 문자열 생성
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        String x1 = words.stream()
                .filter(w -> w.length() >= 3)
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining());

        System.out.println(x1);

    }
}
