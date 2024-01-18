package collection;

import java.util.*;

public class Main {
    static List<Node> list;
    public static void main(String[] args) {
        list = new ArrayList<>();

        list.add(new Node("LEE"));
        System.out.println(list.get(0).name);

        Node node = list.get(0);
        node.name = "Ahn";
        System.out.println(list.get(0).name);

        Integer a = 10000;
        int b = 10000;
        System.out.println(a == b);

    }

    static class Node {
        String name;

        public Node(String name) {
            this.name = name;
        }
    }
}
