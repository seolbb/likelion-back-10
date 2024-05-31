package com.example.day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class IOExam3 {
    public static void main(String[] args) {
        //"test.txt"파일에서 한 줄 씩 입력받아서 입력받은 문자뒤에 hi 를 추가해서
        // "testhi.txt" 파일에 출력하는 프로그램을 작성해보세요.
        try (
                BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
                PrintWriter writer = new PrintWriter("testhi.txt")
        ) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line + "hi");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
