package com.example.day12;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInExam {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        ) {
            boolean b = dis.readBoolean();
            System.out.println(b);
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
