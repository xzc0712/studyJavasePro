package com.xzc.encapsulation;

public class Student {
    private double score;

    public void setScore(double score) {
        if (score >= 0 && score <= 100){
            this.score = score;
         }else{
            System.out.println("数据非法");
         }

    }

    public double getScore() {
        return score;
    }

    public void printPass(){
        System.out.println(score >= 60 ? "Pass" : "Fail");
    }

}
