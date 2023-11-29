package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{0, 100, 20, 1, 4, 2, 8, 59};
        List<Integer> list = Arrays.asList(arr);
        String[] arrStr = {"a", "abc", "abcd", "abcdef"};

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


        // practice
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("David", 30),
                new Person("Eva", 25)
        );

        people.stream()
                .collect(Collectors.groupingBy(p -> p.getName().charAt(0), Collectors.counting()))
                .forEach((k, v) -> {
                    System.out.println("key = " + k + ", value = " + v);
                });

        // 최댓값 찾기
        Optional<Integer> reduce1 = Arrays.stream(arr)
                .reduce((x, y) -> x > y ? x : y);
        System.out.println("최댓값은 ? : " + reduce1.orElse(-1));

    }


}
