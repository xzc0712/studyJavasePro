package com.xzc.d6_abstract_template;

public class Test6 {
    public static void main(String[] args) {
        //目标：搞清楚抽象类的应用场景之一：经常用来设计模式方法设计模式
        //场景：学生，老师都要写一片作文：我的爸爸
        //第一段是一样的，最后一段也是一样的
        Teacher t = new Teacher();
        t.write();

        Student s = new Student();
        s.write();
    }
}
