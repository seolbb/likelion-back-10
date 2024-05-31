package com.example.day13.gyuri;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderTask implements Runnable {
    @Override
    public void run() {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        ) {
            System.out.println("input파일에서 읽어오고 있습니다.");
            String str;
            while ((str = reader.readLine()) != null) {
                Thread.sleep(2000);
                System.out.println(str);
            }
            System.out.println("input파일 내용 출력이 완료되었습니다.");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
