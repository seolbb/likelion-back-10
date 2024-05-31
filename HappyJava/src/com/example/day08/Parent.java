package com.example.day08;

public  class Parent {
    public final void print(){
        System.out.println("parent");
    }
}

//상속 불가능!!
class Child extends Parent{
//    @Override
//    public void print() {
//        super.print();
//    }
}
