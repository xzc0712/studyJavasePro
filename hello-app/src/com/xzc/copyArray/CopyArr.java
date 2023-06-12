package com.xzc.copyArray;

import java.util.Arrays;

/**
 * 把一个数组中的元素复制到新建数组中
 */
public class CopyArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,9,8,7};
        // int[] arr2 = arr1; //指向同一个位置，并没有完成数组复制
        int[] arr2 = new int[arr1.length];
        copyArr(arr1,arr2);
        printArr(arr1);
        printArr(arr2);
    }

    public static void printArr(int []arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void copyArr(int[] arr1 , int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

}
