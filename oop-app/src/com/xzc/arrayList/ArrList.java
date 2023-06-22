package com.xzc.arrayList;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        // 1. 创建一个ArrayList的集合对象
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("xzc");
        list.add(99.5);
        list.add(true);
        System.out.println(list);
        //添加指定类型的集合String,从JDK1.7开始
        ArrayList<String> list2 = new ArrayList<>();

        //2. 往集合中某个索引位置添加一个数据
        list2.add(1,"xzc");
        System.out.println(list2);

        //3. 根据索引获取集合中某个位置的值
        String rs = list2.get(1);
        System.out.println(rs);

        //4. 获取集合的大小
        System.out.println(list2.size());

        //5. 根据索引删除某个元素值，会返回被删除的元素值
        list2.remove(1);
        System.out.println(list2);

        //6. 直接删除某个元素值，删除成功会返回true，失败返回false
        //默认删除第一次出现的数据

        //7. 修改某个索引位置处的数据,并返回修改前的值
        System.out.println(list2.set(1, "xzc"));
    }
}
