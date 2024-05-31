package com.example.day12;

import java.io.*;

public class PhoneExam {
    public static void main(String[] args) {
        String name = null;
        String phoneNumber = null;
        String phoneList = null;

        try (PrintWriter outTxt = new PrintWriter(new FileOutputStream("c:\\temp\\phone.txt", true));
             BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));) {

            for (int count = 1; count <= 3; count++) {
                System.out.print("이름: ");
                name = kb.readLine();
                System.out.print("전화번호: ");
                phoneNumber = kb.readLine();
                outTxt.println(name + " " + phoneNumber);
            }
            outTxt.close();
            System.out.println("... 전화번호가 c:\\temp\\phone.txt에 저장되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file." + e.getMessage());
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\phone.txt"));) {
            System.out.println();
            System.out.println("c:\\temp\\phone.txt의 내용은 다음과 같습니다...");
            while ((phoneList = br.readLine()) != null) {
                System.out.println(phoneList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
