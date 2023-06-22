package com.xzc.d9_interfaceDemo;

import java.util.ArrayList;

public class ClassManger {
    private ArrayList<Student> students = new ArrayList<>();
    StudentOperator studentOperator = new StudentOperatorlmpl2();
    public ClassManger(){
        students.add(new Student("xzc1",'男',99));
        students.add(new Student("xzc2",'男',100));
        students.add(new Student("xzc3",'女',60));
        students.add(new Student("xzc4",'女',64));
    }

    //打印全班全部学生的信息
    public void printInfo(){
        studentOperator.printAllInfo(students);
    }

    //打印全班平均成绩
    public void printAvg(){
        studentOperator.printAvgScore(students);
    }
}
