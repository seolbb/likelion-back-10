package com.example.day08;

public class ExceptionExam06 {
    //1. 예외가 발생했고, 그 예외를 잘 처리한 상황
    //2. 예외가 발생했고, 잘 처리하지 못했을 때.
    //3. 예외가 발생되지 않았을 때.
    public static void main(String[] args) {
        int[] iarr = {1,2,3};
        try {
            System.out.println("try start@@");
            int result = 10/2;
            System.out.println(iarr[2]);

//            iarr = null;
            System.out.println(iarr[0]);

            System.out.println("try end!!.");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException catch block");
            System.out.println(e.getMessage());

        }catch (NullPointerException e){
            System.out.println("NullPointerException catch block");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("반드시실행됨!!");
        }

        System.out.println("다음 문장1");
        System.out.println("다음 문장2");
        System.out.println("다음 문장3");
        System.out.println("end!!");
    }
}
