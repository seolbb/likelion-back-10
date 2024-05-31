package ch01;

public class Test {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(num);
        String text = args[1];
        System.out.println(text);

        boolean flag = Boolean.parseBoolean(args[3]);

        if(flag){
            System.out.println("hahaha");
        }
    }
}
