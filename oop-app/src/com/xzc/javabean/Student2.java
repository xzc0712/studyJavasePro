package com.xzc.javabean;

public class Student2 {
    //1. 私有成员变量，并为每个成员都提供get set方法
    private String name;
    private double score;

    //2. 提供一个公开的无参数方法

    public Student2() {
    }

    public Student2(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
