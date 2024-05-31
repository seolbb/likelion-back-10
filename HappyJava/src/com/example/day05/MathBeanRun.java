package com.example.day05;

public class MathBeanRun {
    public static void main(String[] args) {
        MathBean mathBean = new MathBean();
        mathBean.printClassName();
        mathBean.printNumber(19);
        int result = mathBean.getOne();
        int result2 = mathBean.plus(4,6);

        System.out.println(result);
        System.out.println(result2);
    }
}
