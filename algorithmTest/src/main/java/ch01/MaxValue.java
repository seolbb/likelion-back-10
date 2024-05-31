package ch01;

public class MaxValue {
    //메소드
    //접근제한자 리턴타입 메소드명 (매개변수들...){}
    public static int max(int a, int b, int c){
        if(a > b){
            if(a > c){
                return a;
            }else{
                return c;
            }

        }else if(b > c){
            return b;
        }else{
            return c;
        }
    }

    //main
    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        maxValue.max(1,3,4);

        System.out.println(MaxValue.max(7,89,6));
    }

}
