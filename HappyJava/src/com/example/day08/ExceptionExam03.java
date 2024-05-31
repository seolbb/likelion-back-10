package com.example.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExam03 {
    public static void main(String[] args) throws FileNotFoundException{
        //예외종류 2가지
        //실행시 발생하는 예외(Runtime exception),
        // 컴파일시 체크하는 예외. (checked Exception)

        //예외 처리방법 2가지
        //1. try-catch 으로 처리하는 방법
        //2. throws 하는 방법
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("abc");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
            }
        }

        int[] iarr = null;
        iarr[0] = 10;
    }
}
