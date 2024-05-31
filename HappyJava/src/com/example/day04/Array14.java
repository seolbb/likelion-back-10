package com.example.day04;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[] copyFrom = {1,2,3,4,5,6,7,8};

        int[] copyTo = Arrays.copyOf(copyFrom,copyFrom.length);

        for(int i : copyTo){
            System.out.println(i);
        }
        System.out.println("===============");
        copyTo = Arrays.copyOf(copyFrom,10);

        for(int i : copyTo){
            System.out.println(i);
        }

        System.out.println("===============");
        copyTo = Arrays.copyOfRange(copyFrom,2,4);

        for(int i : copyTo){
            System.out.println(i);
        }
    }
}
