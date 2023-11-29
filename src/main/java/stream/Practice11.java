package stream;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Practice11 {

    public static void main(String[] args) {
        // 정수 리스트에서 최댓값 구하기
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15);

        OptionalInt max = numbers.stream()
                .mapToInt(w -> w)
                .max();

        System.out.println(max.orElse(-1));

    }
}
