package com.xzc.d8_interface2;

public class Test8 {
    public static void main(String[] args) {
        Singer s = new  A();
        s.sing();
    }
}

class A extends Student implements Driver,Singer{

    @Override
    public void drive() {

    }

    @Override
    public void sing() {

    }
}

class Student{}

interface Driver{
    void drive();
}

interface Singer{
    void sing();
}
