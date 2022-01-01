package com.codewithme.collections;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // b -> a ->c

        var front = queue.peek(); // 가장 먼저 들어간 값을 가져온다.
        System.out.println(front);

        // element() 는 값이 비어있으면 exception
        var front2 = queue.element();
        System.out.println(front2);

        // remove()
        var front3 = queue.remove();
        System.out.println(front3);
        System.out.println(queue);

        // poll(): queue 가 비어있으면 null
        var front4 = queue.poll();
        System.out.println(front4);

    }
}
