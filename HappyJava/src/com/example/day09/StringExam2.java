package com.example.day09;

public class StringExam2 {
    //문자열을 입력받아서 공백의 개수를 리턴하는 메소드 
    public static int spaceCount(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c))
                count++;
        }
        return count;
    }

    //문자열을 입력받아서 알파벳 개수를 리턴하는 메소드
    public static int alphaCount(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(spaceCount("test tset ts ttt")); //3
        System.out.println(alphaCount("test tset ts ttt")); //13
    }
}
