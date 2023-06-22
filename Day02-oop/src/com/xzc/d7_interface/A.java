package com.xzc.d7_interface;

public interface A {
    String schoolName = "xzc"; // 常量
    public static final String schoolName2 = "xzc2";

    //成员方法（抽象方法）:不需要方法体
    public  abstract void run();

    //也不能有构造器和代码块
}
