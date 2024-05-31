package com.example.day12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutExam {
    public static void main(String[] args) {
        //원시데이터타입으로 파일에 쓰고 싶다.

//        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        try (
                FileOutputStream fos = new FileOutputStream("data.txt");
                DataOutputStream dos = new DataOutputStream(fos);
        ) {
            dos.writeBoolean(true);
            dos.writeByte(Byte.MAX_VALUE);
            dos.writeChar('a');
            dos.writeDouble(1.1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
