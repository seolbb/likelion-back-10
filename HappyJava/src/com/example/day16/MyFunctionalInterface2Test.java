package com.example.day16;


//public int method(int x, int y)   이런 메서드를 가진 FunctionalInterface를 정의하고
//이런 인터페이스를 사용하는 코드를 만들어 보세요.

public class MyFunctionalInterface2Test {
    public static void main(String[] args) {
        MyFunctionalInterface2 fi2;

        fi2 = new MyFunctionalInterface2() {
            @Override
            public void method(int x) {
                int result = x * 5;
                System.out.println(result);
            }
        };

        fi2.method(10);
        fi2 = (int x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi2 = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };

        fi2 = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi2.method(3);
    }
}
