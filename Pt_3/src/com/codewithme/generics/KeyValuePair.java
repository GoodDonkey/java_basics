package com.codewithme.generics;

/* Generic Class 로 Multiple Type Parameters 정의하기 */
public class KeyValuePair <K, V>{
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
