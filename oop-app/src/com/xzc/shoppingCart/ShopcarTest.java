package com.xzc.shoppingCart;

public class ShopcarTest {
    public static void main(String[] args) {

    }
    /*
    冒泡排序
     */
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //输入大写输出字母小写
    public static String toLowerCase(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A' && chars[i]<='Z'){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
