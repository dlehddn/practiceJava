package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeFinal {

    public static void main(String[] args) {
        // 주어진 사람들의 리스트에서 나이가 30세 이상인 사람들을 성별로 그룹화하고,
        // 각 그룹에서는 그들의 이름으로 이루어진 리스트를 만들어야 합니다. 이를 나이 내림차순으로 정렬한 후 출력해야 합니다.

        List<Person> people = Arrays.asList(
                new Person("Alice", 28, "Female"),
                new Person("Bob", 35, "Male"),
                new Person("Charlie", 30, "Male"),
                new Person("Diana", 25, "Female"),
                new Person("Eve", 32, "Female")
        );

        Map<String, List<String>> collect = people.stream()
                .filter(p -> p.getAge() >= 30)
                .collect(Collectors.groupingBy(p -> p.getGender(),
                        Collectors.mapping(p -> p.getName(), Collectors.toList())));

        collect.forEach((k, v) -> v.sort(Comparator.reverseOrder()));
        System.out.println(collect);
    }
}
