package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Post {

    public static void main(String[] args) {

        int[] intArr = new int[]{1, 2, 3, 4, 10};
        double[] doubleArr = new double[]{1.0, 2.0, 3.0};

        IntStream intStream = Arrays.stream(intArr);
        DoubleStream doubleStream = Arrays.stream(doubleArr);

    }
}
