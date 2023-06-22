package com.xzc.d13_enum2;

public class Test13 {
    public static void main(String[] args) {
        check(Constant2.BOY);
    }
    public static void check(Constant2 sex){
        switch (sex){
            case BOY :
                System.out.println("nan");
                break;
            case GIRL:
                System.out.println("nv");
                break;

        }
    }
}
