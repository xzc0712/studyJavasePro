package com.xzc.d14_extends_constructor;

public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student("Xzc",26,"jld大学");

        //需求:如果没有填写学习，默认为北京大学
    }

}

class Student{
    private String name;
    private int age ;
    private  String schoolName;

    public Student() {
    }

    public Student(String name,int age){
//        this.age = age;
//        this.name = name;
//        this.schoolName = "bjdx";
        this(name,age,"bjdx");
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
