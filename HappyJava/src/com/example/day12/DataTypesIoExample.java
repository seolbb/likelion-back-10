package com.example.day12;

import java.io.*;

public class DataTypesIoExample {
    public static void main(String[] args) {
        //입출력되는 데이터는 모두 바이트거나 캐릭터로 전송되는...   이것을
        //자바의 데이터타입으로 읽고 쓰고 싶다.  //DataInputStream...


        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
             DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {

            // 데이터 쓰기
            dos.writeInt(123);
            dos.writeDouble(123.45);
            dos.writeBoolean(true);
            dos.writeUTF("Hello Java!");

            // 데이터 읽기
            int intData = dis.readInt();
            double doubleData = dis.readDouble();
            boolean booleanData = dis.readBoolean();
            String stringData = dis.readUTF();

            // 출력
            System.out.println("Int data: " + intData);
            System.out.println("Double data: " + doubleData);
            System.out.println("Boolean data: " + booleanData);
            System.out.println("String data: " + stringData);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
