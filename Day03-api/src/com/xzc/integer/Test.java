package com.xzc.integer;

public class Test {
    public static void main(String[] args) {
        Integer a1 = new Integer(12);
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        //自动装箱
        Integer a3 = 12;

        //自动拆箱
        int a4 = a3;
    }
}
