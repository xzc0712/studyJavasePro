package com.xzc.object;

import java.util.Objects;

public class Student implements Cloneable{
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //1. 判断两个对象地址是否相同
        if (this == o) return true;
        // 2. o为空，或者比较双方的类型不一样
        if (o == null || getClass() != o.getClass()) return false;
        //3、o转成类型对象在开始比较内容
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
