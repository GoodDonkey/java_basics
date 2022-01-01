package com.codewithme.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        // key: Email, value: Customer 객체 로 정의하기로 한다.
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var customer = map.get("e1");
        System.out.println(customer);

        // 없으면 null 반환
        var customer2 = map.get("e10");
        System.out.println(customer2);

        // key로 get을 한뒤 없으면 지정한 default value를 반환.
        var unknown = new Customer("Unknown", "");
        var customer3 = map.getOrDefault("e10", unknown);
        System.out.println(customer3);

        // contains
        var exists = map.containsKey("e10");
        System.out.println(exists);

        // replace
        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        // iterate 하기 위해서는 아래와 같이 set을 반환하는 메서드를 사용해야 한다.
        for (var key : map.keySet())
            System.out.println(key);

        for (var entry : map.entrySet())
            System.out.println(entry);

        for (var value : map.values())
            System.out.println(value);
    }

}
