package com.xzc.d6_system;

public class Test6 {
    public static void main(String[] args) {
//        System.exit(0);
        //获取系统时间
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        for (int i = 0; i < 10000; i++) {
        }
        long time2 = System.currentTimeMillis();
        System.out.println((time2-time1) / 1000.0 + "s");
    }
}
