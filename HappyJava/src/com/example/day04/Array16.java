package com.example.day04;

import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
//        int[] array2 = {1,2,3,4,5};
//        int[] array2 = {1,2,3,4,6};
        int[] array2 = {1,2,3,4,7};

        int compare = Arrays.compare(array1, array2);

        System.out.println(compare);
    }
}
