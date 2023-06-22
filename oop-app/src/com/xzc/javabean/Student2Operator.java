package com.xzc.javabean;

public class Student2Operator {
    private  Student2 student2;
    //用来接收学生对象
    public Student2Operator (Student2 student2){
        this.student2 = student2;
    }

    public void printPass(){
        if(student2.getScore() >= 60){
            System.out.println(student2.getName() + " pass");
        }else {
            System.out.println(student2.getName() + "fail");
        }
    }
}
