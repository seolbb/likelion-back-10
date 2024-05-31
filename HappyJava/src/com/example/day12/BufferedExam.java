package com.example.day12;

import java.io.*;

public class BufferedExam {
    public static void main(String[] args) {
        //1. 키보드로부터 한줄씩 5번 입력 받아서 콘솔에 출력하세요.
        //2. 파일에 출력하는 프로그램을 작성해보세요.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             PrintWriter pw = new PrintWriter(new FileWriter("test.txt"));
             PrintWriter pw = new PrintWriter("test.txt");
        ) {
            for (int i = 0; i < 5; i++) {
                System.out.println("입력하세요.");
                String message = br.readLine();
//                System.out.println(message);
                pw.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
