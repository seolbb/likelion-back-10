package ch02;

public class ListPrimes2 {
    public static void main(String[] args) {

        for(int i = 3; i <= 1000; i+=2){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}