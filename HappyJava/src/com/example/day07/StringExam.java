package com.example.day07;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        
        if(str1.equals(str3))
            System.out.println("같아요");
        else
            System.out.println("달라요");

        System.out.println(str1 = str1.concat(" carami@@"));
        System.out.println(str1);
        
    }
}
