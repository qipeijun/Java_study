package com.hello;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo16_For {

    public static void main(String[] args) {
        System.out.println("demo 16 for");

        int[] arr = {11, 22, 33, 44, 55, 66, 77};

        for (int item : arr) {
            System.out.println(item);
        }

        for (int item : arr) {
            System.out.println(item);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        for (String item: list) {
            System.out.println(item);
        }

        /**
         * 增强for 循环，底层依赖的是迭代器 iterator
         */


        // 利用迭代器删除
        Iterator it = list.iterator();
        while (it.hasNext()){
            if ("b".equals(it.next())){
                it.remove(); // 删除b
            }
        }

        for (String item: list) {
            System.out.println(item);
        }

        // 增强for 循环删除  == 增强for 只能遍历，不能删除
//        for (String item: list) {
//            if ("c".equals(item)){
//                list.remove("c");
//            }
//        }
//        for (String item: list) {
//            System.out.println(item);
//        }

    }

}
