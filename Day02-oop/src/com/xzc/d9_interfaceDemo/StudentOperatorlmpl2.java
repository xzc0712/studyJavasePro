package com.xzc.d9_interfaceDemo;

import java.util.ArrayList;

public class StudentOperatorlmpl2 implements StudentOperator{
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        int manNum = 0;
        int womanNum = 0;
        System.out.println("-------全班学生信息如下--------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSex()=='男'){
                System.out.println("学生姓名："+s.getName()+"性别："+s.getSex()+"成绩："+s.getScore());
                manNum ++;
            }else{
                System.out.println("学生姓名："+s.getName()+"性别："+s.getSex()+"成绩："+s.getScore());
                womanNum ++;
            }
            System.out.println("男生总人数为"+manNum+"女生总人数为"+womanNum);
        }
        System.out.println("-----------------------------");
    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double allScore = 0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        System.out.println("--------全班同学平均成绩----------");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore()>max){
                max = students.get(i).getScore();
            }
            if (students.get(i).getScore() < min){
                min = students.get(i).getScore();
            }
            allScore += students.get(i).getScore();
        }
        System.out.println("该班平均成绩为"+(allScore - max - min) / (students.size()-2) );
    }
}
