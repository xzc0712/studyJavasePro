package com.xzc.literal;
/**
 掌握常见数据在程序中的书写格式
 */

public class LiteralDemo {
    public static void main(String[] args) {
        //1. 整数
        System.out.println(666);

        //2. 小数
        System.out.println(99.4);

        //3. 字符：必须要用单引号围起来，且有且只能有一个字符
        System.out.println('a');
        System.out.println('中');
        System.out.println(' ');
        //特殊字符:
        //  \n代表是换行的意思
        //  \t代表的是一个tab

        // 4. 字符串:必须要用双引号围起来，里面的内容其实可以随意
        System.out.println("i love China !!!");

        //5. 布尔值:只有2个值 true false
        System.out.println(true);
        System.out.println(false);
    }
}
