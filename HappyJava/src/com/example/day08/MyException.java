package com.example.day08;

public class MyException extends Exception{
    public MyException(){
        super("점수는 0-100까지만 입력 받을 수 있습니다.");
    }
    public MyException(String msg){
        super(msg);
    }
}
