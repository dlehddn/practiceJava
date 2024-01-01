package stream;

import java.util.Arrays;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        // 주어진 숫자들의 평균값 구하기
        List<Integer> numbers = Arrays.asList(3, 1, 7, 5, 9, 2, 8);
        double v = numbers.stream()
                .mapToInt(num -> num)
                .average()
                .orElse(-1);
        System.out.println(v);
    }
}
