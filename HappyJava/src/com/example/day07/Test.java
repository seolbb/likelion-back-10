package com.example.day07;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
//        String name = child.getName();
//        System.out.println(name);

        System.out.println(child);
        System.out.println(child.toString());

        String str = "hello";

        System.out.println(str);
        System.out.println(str.toString());

        Product pen = new Product("검정펜",3000);

//        pen.getTitle();
//        pen.getPrice();

        System.out.println(pen);


        Product pen2 = new Product("검정펜",2950);

        if(pen == pen2){
            System.out.println("같아요.");
        }else{
            System.out.println("달라요");
        }

        if(pen.equals(pen2)){
            System.out.println("equals  같아요.");
        }else{
            System.out.println("equals 달라요");
        }

//        if(pen.equals(pen2)){
//            System.out.println("equals  같아요.");
//        }else{
//            System.out.println("equals 달라요");
//        }

        System.out.println(pen.getClass());
        System.out.println(pen2.getClass());

    }
}
