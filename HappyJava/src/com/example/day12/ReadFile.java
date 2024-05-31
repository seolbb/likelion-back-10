package com.example.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile {
    public static void main(String[] args) throws Exception {

        //        System.out.println(System.getProperty("user.dir"));
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");
        int n;
        int cnt = 0;
        byte[] bytes = new byte[1024];
//        while ((n = fis.read(bytes)) != -1) {
//            String str = new String(bytes);
//            System.out.println(str);
//            cnt++;
////            fos.write(bytes);
//        }

        while ((n = fis.read()) != -1) {
            System.out.println((char) n);
            cnt++;
            fos.write(n);
        }
        System.out.println(cnt);
        fos.close();
        fis.close();

    }
}
