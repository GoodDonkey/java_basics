package com.codewithme.generics;

public class List {
    private int[] items = new int[10];
    private int  count;

    public void add(int item) {
        items[count++] = item; // add 를 call 할 때마다 증가된 index에 저장.
    }

    public int get(int index) {
        return items[index];
    }
}
