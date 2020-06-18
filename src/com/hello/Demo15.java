package com.hello;

import java.util.ArrayList;
import java.util.Collection;

public class Demo15 {

    public static void main(String[] args){

        System.out.println("demo 15");

        // 集合

        Student[] arr = new Student[5];
        arr[0] = new Student();  // 创建学生对象，存储在第一个位置

        // 数组和集合的区别
        /**
         *
         * 数组既可以存储基本数据类型，又可以存储引用数据类型
         * 集合只能存储引用数据类型(对象)，集合中也可存储基本数据类型，但是在存储的时候会自动装箱变成对象
         *
         * 数组的长度是固定的，不能自动增长
         * 集合的长度是可变的，可以根据元素的增加而增长
         *
         * 如果元素的个数是固定的，推荐使用数组
         * 如果元素个数不是固定的，推荐使用集合
         *
         */

        Collection c = new ArrayList();  // 父类引用子类对象
        boolean b1 = c.add("abc");
        boolean b2 = c.add(true);         // 自动装箱 new Boolean(true)
        boolean b3 = c.add(100);
        boolean b4 = c.add(new Student());  // 如果是list 集合，一直都返回true，因为list集合中，可以存储重复元素，如果是set集合存储重复元素，就会返回false


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println(c);

        // 删除指定元素
        c.remove(true);
        System.out.println(c);

        // 清空集合
        c.clear();
        System.out.println(c);

        // 是否包含
        System.out.println(c.contains(true));  // false  已经全部清空了

        // isEmpty 是否为空
        System.out.println(c.isEmpty());  // true




        // 集合转数组
        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);

        Object[] arr1 = c1.toArray();  // 集合转数组

        System.out.println(arr1);

        for (int i = 0; i< arr1.length; i++){
            System.out.println(arr1[i]);
        }


        // all
        Collection c2 = new ArrayList();
        c2.add("添加一个数组");
        c2.addAll(c1);

        System.out.println(c2);



    }

}

// todo 15-03

