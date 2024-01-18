package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(0);
        list.add(0);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 0) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
