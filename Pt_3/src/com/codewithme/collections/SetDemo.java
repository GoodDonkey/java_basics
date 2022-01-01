package com.codewithme.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "a");

        // set 에 ArrayList 를 넣으면 중복이 사라진다.
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);


        Set<String> set1 = new HashSet<>(Arrays.asList( "a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList( "b", "c", "d"));

        // Union operation
        set1.addAll(set2);
        System.out.println(set1); // [a, b, c, d]

        // Intersection operation: set2에 있는 원소만 남기고 set1에서는 지운다.
        set1.retainAll(set2);
        System.out.println(set1);

        Set<String> set3 = new HashSet<>(Arrays.asList( "a", "b", "c"));
        Set<String> set4 = new HashSet<>(Arrays.asList( "b", "c", "d"));

        // Difference operation: set4에 있는 원속를 set3 에서 모두 지운다.
        set3.removeAll(set4);
        System.out.println(set3);
    }
}
