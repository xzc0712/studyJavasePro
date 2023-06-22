package com.xzc.d1_polymorphism;

public class Teacher extends People{

    public String name = "老师对象";
    @Override
    public void run(){
        System.out.println("老师跑的慢~~");
    }
}
