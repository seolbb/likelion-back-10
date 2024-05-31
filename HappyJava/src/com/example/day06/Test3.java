package com.example.day06;

public class Test3 {
    public static  void m1(Object obj){

    }
    public static void main(String[] args) {
        //1. 부모는 자식을 가리킬 수 있다.
        // 조상은 자손을 가리킬 수 있다.
        Parent p = new Child();
        Object obj = new Child();
        Object obj2 = new Parent();

        m1((Child)p);
        m1((Child)obj);
//        m1((Child)obj2);
//
//        System.out.println(obj.i);
//        System.out.println(obj.getI());
//        System.out.println(((Child)obj).i);
//        System.out.println(((Child)obj).getI());

        Child c =(Child)obj;
        System.out.println(c.i);
        System.out.println(c.getI());


        byte b = 4;
        int i = b; //묵시적형변환

        b = (byte) i;  //명시적 형변환

        Object bbb  = new Object();

        if(bbb instanceof Child) {
            Child ccc = (Child) bbb;
            System.out.println("형변환 완료!!");
        }

    }
}
