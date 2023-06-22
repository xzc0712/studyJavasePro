package com.xzc.d12_extends_override;

public class Test12 {
    public static void main(String[] args) {
        B b = new B();
        b.print1();
        b.print2(2 , 3);

        System.out.println("-----------------");

        Student s = new Student("xzc" , 19);
        System.out.println(s.toString());
        System.out.println(s);

    }
}

