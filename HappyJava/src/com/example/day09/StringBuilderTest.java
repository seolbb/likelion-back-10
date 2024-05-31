package com.example.day09;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World"); // 문자열 추가
        builder.insert(6, "Java "); // 특정 위치에 문자열 삽입
        System.out.println(builder); // 출력: Hello Java World

        builder.delete(6, 11); // 특정 부분 삭제
        System.out.println(builder); // 출력: Hello World

        builder.reverse(); // 문자열 뒤집기
        System.out.println(builder); // 출력: dlroW olleH
    }
}
