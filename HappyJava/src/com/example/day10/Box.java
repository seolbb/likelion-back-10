package com.example.day10;

public class Box<V> {
    private V value;

    public Box(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("hello");
        String value = stringBox.getValue();

        Box<Integer> integerBox = new Box<>(10);
        int intValue = integerBox.getValue();
    }
}
