package com.example.day10.box;

public class ColoredBox<T, C> extends Box<T> {
    private C color;

    public ColoredBox(T content, C color) {
        super(content);
        this.color = color;
    }

    public C getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Colored box with color " + color + " containing: " + getContent();
    }

    public static void main(String[] args) {
        ColoredBox<String, String> coloredBox = new ColoredBox<>("pen", "red");
        System.out.println(coloredBox);
    }
}
