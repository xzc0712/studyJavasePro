package com.xzc.d9_modifer;

public class Fu {
    //私有
    private void printMethod(){
        System.out.println("===private===");
    }
    //缺省
    void method(){
        System.out.println("===缺省===");
    }
    //protect
    protected void printMethod2(){
        System.out.println("===protect===");
    }
    //public
    public void printMethod3(){
        System.out.println("===public===");
    }


}
