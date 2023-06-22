package com.xzc.javabean;

import com.xzc.encapsulation.Student;

public class Test {
    //目标：掌握实体类的书写要求、特点、应用场景
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.setName("小明");
        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        Student2Operator operator = new Student2Operator(s1);
        operator.printPass();

    }
}
