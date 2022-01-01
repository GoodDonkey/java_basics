package com.codewithme.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!"); // 2개 인자를 넣으면 (index, element)
        System.out.println(list);
        list.clear();

        // Collections.addAll() 사용 가능
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list);

        // get(): 인덱스로 값 가져오기
        System.out.println(list.get(0));

        // set(): 인덱스로 값 바꾸기
        list.set(0, "a+");
        System.out.println(list);

        // remove(): 인덱스로 값 지우기
        list.remove(0);
        System.out.println(list);

        // indexOf() : 값으로 인덱스 가져오기. 가장 첫번째 나타난 인덱스만 반환.
        System.out.println(list.indexOf("b"));

        // 값이 없으면 -1 반환
        System.out.println(list.indexOf("a+"));

        Collections.addAll(list, "a", "b", "c");

        // lastIndexOf(): 가장 마지막 나타난 인덱스를 반환
        System.out.println(list);
        System.out.println(list.lastIndexOf("b"));

        // subList(): 기존 list에서 특정 인덱스 부분만 새로운 list로 만들어 반환
        System.out.println(list.subList(0, 2));
    }
}
