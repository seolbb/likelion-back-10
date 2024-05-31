package com.example.day10;

public class GenericMethodExample2 {
    public static <T extends Number> T max(T x, T y, T z) {
        T max = x;
        if (y.doubleValue() > max.doubleValue()) {
            max = y;
        }
        if (z.doubleValue() > max.doubleValue()) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 5, 1));
        System.out.println(max(3.4, 2.3, 7.4));
//        System.out.println(max("ab","ccc", "22"));  컴파일 에러 발생!!

    }

}
