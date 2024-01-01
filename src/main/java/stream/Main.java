package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{0, 100, 20, 1, 4, 2, 8, 59};
        List<Integer> list = Arrays.asList(arr);


        String[] arrStr = {"a", "abc", "abcd", "abcdef"};

        int[] intArr = new int[]{1, 2, 3, 4};
        IntStream intStream = Arrays.stream(intArr);



        list.stream()
                .sorted()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        List<Integer> list1 = Arrays.stream(arr)
                .sorted()
                .filter(number -> number % 2 == 0)
                .toList();

        list1.stream()
                .forEach(System.out::println);

        System.out.println("map test");
        Optional<Integer> reduce = Arrays.stream(arrStr)
                .map(s -> s.length())
                .reduce((x, y) -> x + y);
        System.out.println(reduce.orElse(0));


        // 최댓값 찾기
        Optional<Integer> reduce1 = Arrays.stream(arr)
                .reduce((x, y) -> x > y ? x : y);
        System.out.println("최댓값은 ? : " + reduce1.orElse(-1));

    }


}
