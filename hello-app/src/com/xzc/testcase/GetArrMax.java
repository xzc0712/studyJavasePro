package com.xzc.testcase;

public class GetArrMax {
    public static void main(String[] args) {
        int [] arr = {15,900,1000,2000,9500,-5};
        int temp = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp){
                temp = arr[i];
            }
        }
        System.out.println("Arr's max num is " + temp);
    }
}
