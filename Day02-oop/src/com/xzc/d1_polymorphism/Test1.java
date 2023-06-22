package com.xzc.d1_polymorphism;

public class Test1 {
    public static void main(String[] args) {
        //1. 对象多态
        People p1 = new Teacher();
        p1.run();
        System.out.println(p1.name);
        //识别技巧：编译看左边，运行看右边new


        People p2 = new Student();
        p2.run();
        System.out.println(p2

                .name);
    }
}
