package com.xzc.stringbuilder;

public class Test4 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder() ; // ""
        StringBuilder sb = new StringBuilder("xzc") ; // "xzc"
        sb.append(12);
        sb.append("nihao");
        sb.append(true);

        //链式编程
        sb.append(666).append("xzc2");

        //反转操作
        sb.reverse();

        //返回字符串长度
        System.out.println(sb.length());

        //StringBuild--->String
        sb.toString();
    }
}
