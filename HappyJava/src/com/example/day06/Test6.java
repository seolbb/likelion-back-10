package com.example.day06;

class 새{
    public void say(){
        System.out.println("??");
    }
}
class 앵무새 extends 새{
    public void say(){
        System.out.println("안녕@");
    }
}
class 참새 extends 새{
    public void say(){
        System.out.println("짹짹");
    }
}
class 비둘기 extends 새{
    public void say(){
        System.out.println("구구");
    }
}
public class Test6 {
    public static void main(String[] args) {
        새 bird = null;
        if(args[0].equals("앵무새")){
            bird = new 앵무새();
        }else if(args[0].equals("참새")){
            bird = new 참새();
        }else{
            bird = new 비둘기();
        }

        bird.say();
    }
}
