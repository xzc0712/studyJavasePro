package com.xzc.findSushu;
/**
 * 找到101-200之间的素数并输出
 */

public class FindSushu {
    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 101; i <= 200 ; i++) {
            flag = isSushu(i);
            if (flag) System.out.println(i+ "\t" );
        }
    }
    /*从2开始到中间*/
    public static boolean isSushu(int num){
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0){
                return false;
                //break;
            }
        }
        return true;
    }

}
