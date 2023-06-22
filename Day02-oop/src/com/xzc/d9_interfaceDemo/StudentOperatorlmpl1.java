package com.xzc.d9_interfaceDemo;

import java.util.ArrayList;

public class StudentOperatorlmpl1 implements StudentOperator{
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("-------全班学生信息如下--------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("学生姓名："+s.getName()+"性别："+s.getSex()+"成绩："+s.getScore());
        }
        System.out.println("-----------------------------");
    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double allScore = 0;
        System.out.println("--------全班同学平均成绩----------");
        for (int i = 0; i < students.size(); i++) {
            allScore += students.get(i).getScore();
        }
        System.out.println("该班平均成绩为"+allScore/students.size());
    }
}
