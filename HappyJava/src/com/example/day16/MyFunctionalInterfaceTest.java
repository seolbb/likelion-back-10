package com.example.day16;

class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

    @Override
    public void method1() {
        System.out.println("method1");
    }

//    @Override
//    public void method2() {
//        System.out.println("method2");
//    }
}

public class MyFunctionalInterfaceTest {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface;
        MyFunctionalInterface myFunctionalInterface1;
        MyFunctionalInterface myFunctionalInterface2;
        myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public void method1() {
                System.out.println("method 1 call");
            }

//            @Override
//            public void method2() {
//                System.out.println("method 2 call");
//            }
        };


        myFunctionalInterface1 = new MyFunctionalInterfaceImpl();


        myFunctionalInterface2 = () -> System.out.println("method1");

        myFunctionalInterface.method1();
        myFunctionalInterface1.method1();
        myFunctionalInterface2.method1();

        myFunctionalInterface2 = () -> System.out.println("hahaha");
        myFunctionalInterface2.method1();

        myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public void method1() {
                System.out.println("hohoho");
            }
        };
        myFunctionalInterface.method1();

    }
}
