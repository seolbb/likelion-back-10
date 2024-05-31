package com.example.day07.interfaceExam;

public interface Animal {
    int AGE = 1; //상수
    void speak();

//    String speak(String msg);

     default  void song(){
         System.out.println("노래하다.");
     }
}
