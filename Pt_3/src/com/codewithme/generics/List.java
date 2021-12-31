package com.codewithme.generics;

public class List {
    private Object[] items = new Object[10];
    private int  count;

    public void add(Object item) {
        items[count++] = item; // add 를 call 할 때마다 증가된 index에 저장.
    }

    public Object get(int index) {
        return items[index];
    }
}
