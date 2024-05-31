package com.example.day12;

import java.io.*;

public class ObjectStreamExam {
    public static void main(String[] args) {
        //객체를 파일에 저장
        Person person = new Person("kang", 20);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"));) {
            out.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

//
//        Person readPerson = null;
//        //파일에서 객체를 읽어오기!!
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"))) {
//            readPerson = (Person) in.readObject();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(readPerson);
//        System.out.println(readPerson.getName());
//
//        readPerson.setAge(40);
//        System.out.println(readPerson.getAge());
    }
}
