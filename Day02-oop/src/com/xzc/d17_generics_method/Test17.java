package com.xzc.d17_generics_method;

public class Test17 {
    public static void main(String[] args) {
        System.out.println(test("Java"));
    }

    public static <T> T test(T t){
        return t ;
    }
}
