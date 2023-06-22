package com.xzc.d14_generics;

import java.util.ArrayList;

public class Test14 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Xzc1");
        list.add("Xzc2");
        list.add("Xzc3");
        list.add("Xzc4");

        for (int i = 0; i < list.size(); i++) {
            String e = (String) list.get(i);
            System.out.println(e);
        }

    }
}

class Cat{}
