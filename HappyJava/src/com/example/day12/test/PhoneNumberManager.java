package com.example.day12.test;

import java.io.*;

public class PhoneNumberManager {
    public static void main(String[] args) {
        File dir = new File("src/com/example/day12/test/phone.txt");
        String files = dir.getAbsolutePath();

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileOutputStream writer = new FileOutputStream(files);
                BufferedReader fileReader = new BufferedReader(new FileReader(files));
        ) {
            for (int i = 0; i < 3; i++) {
                System.out.print("이름: ");
                String name = reader.readLine();
                System.out.print("전화번호: ");
                String number = reader.readLine();
                writer.write((name + "\t" + number + "\n").getBytes());
                writer.flush(); //쓰기 버퍼를 비우고 즉시 파일에 반영!!
            }
            System.out.println("... 전화번호가 " + files + "에 저장되었습니다.");

            //쓰기 작업이 끝난 시점에
            writer.close();  //쓰기를 종료하고 파일을 닫는다.

            System.out.println(files + "의 내용은 다음과 같습니다...");
            String info;
            while ((info = fileReader.readLine()) != null) {
                System.out.println(info);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}