package com.xzc.testcase;

import java.util.Scanner;

/**
 需求:
机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
机票最终优惠价格的计算方案如下:旺季（5-10月）头等舱9折，经济舱8.5折，淡季(11月到来年4月）头等舱7折，经济舱6.5折。
分析:
键盘录入机票的原价，仓位类型，月份信息，调用方法返回机票最终的优惠价格。
方法内部应该先使用if分支判断月份是是旺季还是淡季，然后使用switch分支判断是头等舱还是经济舱。
*/

public class AirTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double oriPrice = sc.nextDouble();

        System.out.println("请输入机票的月份");
        int month = sc.nextInt();
        System.out.println("请你选择仓位类型");
        String type = sc.next();

        System.out.println("机票优惠后价格为" + calc(oriPrice , month , type));
    }
    /**
     * 定义方法接收信息，统计优惠后的价格返回
     */
    public static double calc(double oriPrice,int month , String type){
        if(month >= 5 && month <=10){
            switch (type){
                case "头等舱":
                    oriPrice *= 0.9;
                    break;
                case "经济舱":
                    oriPrice *= 0.85;
                    break;
                default:
                    System.out.println("输入的仓位类型有误");
                    oriPrice = -1;
            }
        } else if (month == 11 ||month == 12 || month <= 4) {
            switch (type){
                case "头等舱":
                    oriPrice *= 0.7;
                    break;
                case "经济舱":
                    oriPrice *= 0.65;
                    break;
                default:
                    System.out.println("输入的仓位类型有误");
                    oriPrice = -1;
            }
        } else {
            System.out.println();
            return  -1;
        }
        return  oriPrice ;
    }

}
