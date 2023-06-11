package com.xzc.variable;

import java.util.Scanner;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标:需要理解变量使用的注意事项

        //1. 变量要先声明再使用
        int a  = 23 ;
        System.out.println(a);

        //2. 变量声明后不能够存储其他类型的数据
        // a = 6.5 ;

        // 3. 变量的有效范围是从定义开始到“}”截至，且再同一个范围内布不能够定义2个同名的变量
        {
            int b = 25 ;
            System.out.println(b);
//            int b = 2530 ;
        }
        // System.out.println(b);有问题

        // 4. 变量定义的时候可以没有初值，但是使用的时候必须给初始值
//        int c  ;
//        System.out.println(c);

    }
}
