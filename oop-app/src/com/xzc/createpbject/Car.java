package com.xzc.createpbject;

public class Car {
    /**
      成员变量
     */
    String name;
    double price ;
    /**
     方法
     */
    public void start(){
        System.out.println(name + "启动了");
    }

    public void run(){
        System.out.println("价格是" + price);
    }
}
