package ch02;

import java.util.Arrays;

public class DuplicateArray {
    public static int[] change(int[] copied){
        copied[2] = 10;
        return copied;
    }

    public static int change(int orig){
        orig = 20;
        return orig;
    }
    public static void main(String[] args) {
        int[] original = {10,20,30,40,50};

//       int[] copied =change(original);

        int[] copied = original.clone();
//
//        copied[2] = 0;
//
        System.out.println(original[2]);
        System.out.println(copied[2]);

        System.out.println(Arrays.toString(original));

        int orig = 10;
        int copi = change(orig);
        System.out.println(orig);
        System.out.println(copi);
    }
}
