package com.xzc.d15_generics_class;

public class Test15 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("xzc1");
        list.add("xzc2");
        System.out.println(list.get(1));
    }
}
