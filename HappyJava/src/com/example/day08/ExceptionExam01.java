package com.example.day08;

public class ExceptionExam01 {
    public static void main(String[] args) {
        int[] iarr = {1,2,3};
        try {
            int result = 10/2;
            System.out.println(iarr[3]);

            System.out.println("거울을 본다.");

        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(iarr[0]);
            System.out.println(e.toString());
            System.out.println(e.getMessage());

        }catch (Exception e){
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("다음 문장1");
        System.out.println("다음 문장2");
        System.out.println("다음 문장3");
        System.out.println("end!!");
    }
}
