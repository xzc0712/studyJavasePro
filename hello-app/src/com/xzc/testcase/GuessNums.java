package com.xzc.testcase;

import java.util.Random;
import java.util.Scanner;

public class GuessNums {
    public static void main(String[] args) {
        //随机生成1-20之间5个数字，猜中输出该数字第一次出现的位置并输入全部5个数据。

        Random rd = new Random();

        int[] nums = new int[5];
        int temp = 0 ;
        for (int i = 0; i < 5; i++) {
            nums[i] = rd.nextInt(20 - 1 + 1 );
        }
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
//            for (int i = 0; i < 5; i++) {
//                if (num == nums[i]) {
//                    temp = 1 ;
//                    System.out.println("nice!!! This num's location is " + i);
//                    System.out.println(nums[0]);
//                    System.out.println(nums[1]);
//                    System.out.println(nums[2]);
//                    System.out.println(nums[3]);
//                    System.out.println(nums[4]);
//                    break;
//                }
//            }
//            if( temp == 1 )break;
//        }
        OUT:
        while (true){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                if (num == nums[i]) {
                    System.out.println("nice!!! This num's location is " + i);
                    System.out.println(nums[0]);
                    System.out.println(nums[1]);
                    System.out.println(nums[2]);
                    System.out.println(nums[3]);
                    System.out.println(nums[4]);
                    break OUT;
                }
            }
        }


    }
}
