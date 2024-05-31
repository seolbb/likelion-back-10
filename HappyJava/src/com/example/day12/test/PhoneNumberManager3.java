package com.example.day12.test;

import java.io.*;

public class PhoneNumberManager3 {
    public static void main(String[] args) {
        File dir = new File("src/com/example/day12/test/phone.txt");
        String files = dir.getAbsolutePath();

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileWriter writer = new FileWriter(files);
        ) {
            for (int i = 0; i < 3; i++) {
                System.out.print("이름: ");
                String name = reader.readLine();
                System.out.print("전화번호: ");
                String number = reader.readLine();
                writer.write((name + "\t" + number + "\n"));
            }
//            writer.flush();  // 명시적 플러시
            System.out.println("... 전화번호가 " + files + "에 저장되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (
                BufferedReader fileReader = new BufferedReader(new FileReader(files));
        ) {
            System.out.println(files + "의 내용은 다음과 같습니다...");
            String info;
            while ((info = fileReader.readLine()) != null) {
                System.out.println(info);
            }
        } catch (IOException e) {
        }
    }
}
