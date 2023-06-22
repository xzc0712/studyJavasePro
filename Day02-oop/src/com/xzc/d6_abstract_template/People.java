package com.xzc.d6_abstract_template;

public abstract class People {
    /*
    * 设计模板方法
    * 1. 定义一个模板方法
    * */
    public void write(){
        System.out.println("xzc");
        System.out.println(writeMain());
       //模板方法不清楚正文该怎么写，但是知道子类肯定要写
        System.out.println("xzc2");
    }

    //3. 设计一个抽象方法写正文
    public abstract String writeMain();
}
