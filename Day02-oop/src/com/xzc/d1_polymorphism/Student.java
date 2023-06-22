package com.xzc.d1_polymorphism;

public class Student extends People{
    public String  name = "学生对象";
    @Override
    public void run(){
        System.out.println("学生跑的快");
    }
}
