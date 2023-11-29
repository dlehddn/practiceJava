package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{0, 49, 20, 1, 4, 2, 8, 59};
        List<Integer> list = Arrays.asList(arr);

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

    }
}
