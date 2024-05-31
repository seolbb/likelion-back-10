package com.example.day04;

public class Array08 {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        array[0][0] = 0;
        array[0][1] = 1;
        array[0][2] = 2;

        array[1][0] = 3;
        array[1][1] = 4;
        array[1][2] = 5;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[] iarr = {1,23,3};
        int[][] iarr2 = {{1,2},{3,4}};

        int[][] iarr3 ={{1,23,4},{1},{1,3,4}};

    }
}