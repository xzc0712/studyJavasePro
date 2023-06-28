package com.xzc.object;

public class Test1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("xzc",23);
        System.out.println(s1);  //com.xzc.object.Student@14ae5a5
        System.out.println(s1.toString()); //Student{name='xzc', age=23}

        Student s2 = new Student("xzc",23);
        System.out.println(s2.equals(s1));   //不重写是比较地址是否相等,重写后比较值内容

        Student s3 = (Student) s1.clone();
        System.out.println(s3);
    }
}
