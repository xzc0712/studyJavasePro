package com.xzc.d14_extends_constructor;

public class Test14 {
    public static void main(String[] args) {
        Teacher t = new Teacher("xzc",36,"Java");

    }
}

class Teacher extends People{
    private String skills;

    public Teacher(String name , int age , String skills){
        super(name,age);
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}

class People{
    private String name ;
    private int age  ;

    public People() {
    }

    public People(String name, int age) {
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
