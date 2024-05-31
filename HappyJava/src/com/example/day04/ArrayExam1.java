package com.example.day04;

public class ArrayExam1 {
    public static void main(String args[]) {
        //선언
        int[] iarr;

        int iarr2[];

        //생성
        iarr = new int[3];
        iarr2 = new int[5];

        //이용
        iarr[0] = 10;
        iarr[1] = 20;

        int i = iarr[0];

        System.out.println(i);
        System.out.println(iarr[0]);

//        iarr[3] = 40;

        System.out.println(iarr[2]);

        int[] array1, array2;

        int array3[], array4;

        array2 = new int[2];

        array4 = 10;

        int[] iia = new int[4];

        iia[0] = 19;

        int[] arr2 = new int[]{10,20,30};
        int[] arr3 = {10,20,30,40};

        System.out.println(arr2[2]);
        System.out.println(arr3[3]);
        System.out.println("========");
        //반복문
        for(int ii =0; ii < 4; ii++){
            iia[ii] = ii+1;
        }

        for(int j = 0; j < 4; j++){
            System.out.println(iia[j]);
        }

    }
}
