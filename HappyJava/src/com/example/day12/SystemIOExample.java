package com.example.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIOExample {
    public static void main(String[] args) {
        //키보드(System.in)로부터 한 줄 입력 받기위한 IO객체를 생성해 주세요.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("문자열을 입력하세요.");
            String useerInput = br.readLine();
            System.out.println(useerInput);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
