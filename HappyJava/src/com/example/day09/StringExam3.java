package com.example.day09;

public class StringExam3 {
    //문자열을 입력받아서 역순의 문자열로 바꾸어서 문자열을 리턴하는 메소드 ex) abc - > cda
    public static String reverseChange(String str) {
//        StringBuilder reversed = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseChange("abc")); //cba
        System.out.println(reverseChange("hello world!!"));
    }
}
