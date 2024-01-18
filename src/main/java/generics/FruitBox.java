package generics;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    List<Fruit> box = new ArrayList<>();

    public void add(T t) {
        box.add(t); //컴파일 에러
    }
}
