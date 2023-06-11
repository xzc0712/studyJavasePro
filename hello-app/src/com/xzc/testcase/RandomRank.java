package com.xzc.testcase;

import java.util.Arrays;
import java.util.Random;

public class RandomRank {
    public static void main(String[] args) {
        // 先录入5个员工工号，然后展示一组随机的排名顺序
        //  1. 依次遍历数组的每个元素，随机一个索引数据，然后让当前元素与该索引位置处的元素进行交换。
        int[] arr = {22,33,35,13,88};
        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shuffleArray(int[] arr){
        Random rd = new Random() ;
        for (int i = arr.length - 1 ; i > 0 ; i--) {
            int j = rd.nextInt(i -0  + 1 ); // 生成随机数索引
            int temp = arr[i];   //交换
            arr[i] = arr[j];
            arr[j] = temp ;
        }
    }
}
