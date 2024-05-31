package com.example.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IOExam2 {
    public static void main(String[] args) throws Exception {
        //키보드로부터 한줄씩 입력 받아서 콘솔에 출력하고 싶다.

        //키보드 System.in
        //한줄씩 읽기위해서 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br2 = new BufferedReader(new FileReader("a.txt"));


        String str = br.readLine();

        System.out.println(str);

        System.out.println(br2.readLine());
    }
}
