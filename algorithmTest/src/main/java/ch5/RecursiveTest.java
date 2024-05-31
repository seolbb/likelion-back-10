package ch5;

public class RecursiveTest {
    static void recursice(int n){
        if(n > 0){
            recursice(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        recursice(5);
    }
}
