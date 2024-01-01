package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice9 {
    public static void main(String[] args) {
        // 주어진 숫자 리스트에서 짝수를 선택하고 그 제곱을 오름차순으로 정렬한 리스트 만들기
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 9, 4, 7, 6);
        List<Integer> collect = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
