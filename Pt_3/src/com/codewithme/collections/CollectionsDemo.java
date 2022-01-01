package com.codewithme.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        // for 가능
        for (var item : collection)
            System.out.println(item);

        // ArrayList 자체를 프린트 가능
        System.out.println(collection);

        // 한번에 여러 원소 add 하기: Collections 를 사용.
        Collections.addAll(collection, "a", "b", "c");
        System.out.println(collection);
        System.out.println(collection.size());

        // remove: 값으로 지우기: 가장 첫번쨰 a 만 지운다.
        collection.remove("a");
        System.out.println(collection);

        // clear
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty()); // 원소가 없는지 확인

        // contains: "a" 가 있는지 확인
        var containsA = collection.contains("a");
        System.out.println(containsA);

        Collections.addAll(collection, "a", "b", "c");

        // toArray()
        Object[] objectArray = collection.toArray(); // 기본적으로 Object[]를 반환한다.
        System.out.println(objectArray[0]);

        // String[0] 로 정의하면 빈 array를 반환하되 크기를 지정하지 않을 수 있다.
        String[] stringArray = collection.toArray(new String[0]);
        stringArray[0].toUpperCase(Locale.ROOT); // String 의 메서드를 사용할 수 있다.

        /* 비교하기 */
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection == other); // 메모리 reference 로 비교한다.
        System.out.println(collection.equals(other)); // 값을 비교한다.
    }
}
