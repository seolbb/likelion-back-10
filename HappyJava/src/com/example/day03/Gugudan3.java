package com.example.day03;

public class Gugudan3 {
    public static void main(String[] args) {
       outter: for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
//
                //\t tab   \r \n
                System.out.print(j + " * " + i + " = " + (j * i)+"\t");
//                System.out.printf("%d * %d = %d\t",j,i,j*i);
                if(j == 5)
                    break outter;

            }

            System.out.println();
        }

//        for(String i : args){
//
//        }
    }
}
