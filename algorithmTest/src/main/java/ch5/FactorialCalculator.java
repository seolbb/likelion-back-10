package ch5;

import java.util.Scanner;

public class FactorialCalculator {
    static int computeFactorial(int n){
        if(n > 0){
            return n * computeFactorial(n-1);
        }else{
            return 1;
        }
    }

    static int factorial(int n){
        int fact = 1;
        while(n>1){
            fact = fact * n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("계산할 정수를 입력하세요.");

        int num = keyboard.nextInt();

        System.out.println(computeFactorial(5));

        System.out.println(factorial(5));
    }
}
