package ch02;

public class DecimalToBinaryExam {
    public static void main(String[] args) {
        int decimal = 29;

        StringBuilder binary = new StringBuilder();

        while(decimal > 0){
            int remainder = decimal % 2;
            decimal = decimal / 2;
            System.out.println(remainder);
            binary.append(remainder);
        }
        System.out.println( binary.reverse().toString());
    }
}
