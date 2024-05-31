package com.example.day04;

import com.example.day02.Book;

public class Array12 {
    public static void main(String[] args) {
        int[] iarr = {10,20,30,40};

        //for each 문

        for(int i:iarr){
            System.out.println(i);
        }

        for(int i =0; i < iarr.length; i++){
            int v = iarr[i];
            System.out.println(v);
        }

        ItemForArray[] items = new ItemForArray[4];
        items[0] = new ItemForArray(3000,"cup");
        for(ItemForArray product :items){
            System.out.println(product.getName());
        }


    }
}
