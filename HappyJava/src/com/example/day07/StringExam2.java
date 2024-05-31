package com.example.day07;

public class StringExam2 {
    public static void main(String[] args) {
        String str = "java programming!!";

        System.out.println(str.charAt(3));

        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 7));

        String str2 = "    abc    ";
        if("abc".equals(str2.trim())){
            System.out.println(true);
        }else
            System.out.println(false);


    }
}
