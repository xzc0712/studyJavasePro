package com.xzc.randNum;

import java.util.Random;

public class RandNum {
    public static void main(String[] args) {
//        String str0 = "满意";
//        String str1 = "一般满意";
//        String str2 = "不满意";
//        String str0 = "豁达";
//        String str1 = "一般豁达";
//        String str2 = "不豁达";
        String str0 = "感到精力充沛";
        String str1 = "一般豁达";
        String str2 = "不豁达";
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(3);
            switch (num){
                case 0:
                    System.out.println(str0);
                    break;
                case 1:
                    System.out.println(str1);
                    break;
                case 2:
                    System.out.println(str2);
                    break;
            }
        }
    }
}
