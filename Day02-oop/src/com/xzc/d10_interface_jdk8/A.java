//package com.xzc.d10_interface_jdk8;
//
//public interface A {
//    /**
//     1. 默认方法：必须使用default修饰，默认会用public修饰
//     实例方法：对象的方法，必须使用实现类的对象来访问
//     */
//    default void test1(){
//        System.out.println("==默认方法==");
//        test2();
//    }
//
//    /**
//     * 2. 私有方法：必须使用private修饰（JDK9以上）
//     * 实例方法：对象的方法
//     * 只能在接口内使用
//     * */
//    private void test2(){
//        System.out.println("==私有方法==");
//    }
//
//    /**
//     * 3. 静态方法：必须使用static修饰,默认public修饰*/
//    static  void  test3(){
//        System.out.println("==静态方法==");
//    }
//
//}
