package com.xzc.d14_extends_constructor;


class F{
    //父类无参构造器
    public F(){
        System.out.println("===父类F的 无参数构造器 执行了===");
    }
}
class Z extends F{
    //子类无参构造器
    public Z(){
        System.out.println("===父类Z的 无参数构造器 执行了===");
    }
}
public class Test {
    public static void main(String[] args) {
        Z z = new Z();
    }
}
