package com.xzc.createCode;

import java.util.Random;

public class CreateCode {
    public static void main(String[] args) {
        System.out.println(createCode(5));
    }
    public static String createCode(int n){
        String res = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int num = r.nextInt(3);
            switch (num){
                case 0:
                    //处理大写
                    char a = (char)( r.nextInt(26) + 65 );
                    res += a ;
                    break;
                case 1:
                    //处理小写
                    char b = (char)( r.nextInt(26) + 97 );
                    res += b ;
                    break;
                case 2:
                    //处理数字
                    //注意数字类型不用转换成char，否则会出现乱码现象
                    res += r.nextInt(10) ;
                    break;
            }
        }
        return res;
    }
}
