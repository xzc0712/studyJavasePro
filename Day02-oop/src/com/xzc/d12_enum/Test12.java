package com.xzc.d12_enum;

public class Test12 {
    public static void main(String[] args) {
        A a1 = A.X;

        A[] values = A.values();

        A a3 = A.valueOf("Y");
        System.out.println(a3.name());
        System.out.println(a3.ordinal()); //索引
    }
}
