package com.xzc.testcase;

import java.util.Random;
import java.util.Scanner;

public class RamdomTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        //生成1-100之间的数字，提示用户猜测，猜大提示大，猜小提示小，直到猜对。
        //1.生成随机数
        Random rand = new Random();
        //int num = rand.nextInt(max-min+1);
        int adnum = rand.nextInt(100 - 1 + 1);
        System.out.println("随机数为"+adnum);
        //2.循环用户输入

        while(true){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num < adnum){
                System.out.println("输入小于预期");
            } else if (num > adnum) {
                System.out.println("输入大于预期");
            }else break;
        }

        System.out.println("随机数为"+adnum);


    }
}
