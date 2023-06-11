package com.xzc.scanner;

import java.util.Scanner;

//1. 导包操作
public class ScannerDemo {
    public static void main(String[] args) {
        //2. 得到一个键盘扫描对象
        Scanner sc = new Scanner(System.in);

        //3. 调用sc对象的功能等待接受用户输入的数据
        System.out.println("请输入您的年龄");
        int age = sc.nextInt();
        System.out.println("你的年龄是："+ age );

        System.out.println("请输入您的名称");
        String name = sc.next();
        System.out.println("你的名称是："+ name );
    }
}
