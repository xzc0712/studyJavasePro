package com.xzc.stringbuilder;

public class Test_demo {
    public static void main(String[] args) {
        int[] a = {11,22,33};
        System.out.println(getArrData(a));
    }
    /**
     * 设计一个方法，用于返回任意整形数组的内容，要求返回的数组内容格式如【11，22，33】
     * */
    public static String getArrData(int[] arr){
        if (arr == null) {
            return null;
        }

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s.append(arr[i]);
            }else {
                s.append(arr[i]).append(",");
            }
        }
        s.append("]");
        return s.toString();
    }
}
