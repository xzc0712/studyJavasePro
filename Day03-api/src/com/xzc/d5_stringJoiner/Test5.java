package com.xzc.d5_stringJoiner;

import java.util.StringJoiner;

public class Test5 {
    public static void main(String[] args) {
        //StringJoiner s = new StringJoiner(","); //间隔符
        StringJoiner s = new StringJoiner(",","[","]"); //间隔符,起始，终止
        s.add("xzc1");
        s.add("xzc2");
        s.add("xzc3");
        System.out.println(s); //xzc1,xzc2,xzc3
    }
}
