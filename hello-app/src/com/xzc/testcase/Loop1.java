package com.xzc.testcase;

public class Loop1 {
    public static void main(String[] args) {
        // 需求:珠穆朗玛峰的高度是8848860，纸张厚度为0.1 折叠纸张直到不低于高度，求折叠几次？
        final double height = 8848860;
        double weight = 0.1;
        int count = 0 ;
        while (weight < height){
            weight *=  2 ;
            count ++;
        }
        System.out.println("需要折叠"+count +"次");
    }
}
