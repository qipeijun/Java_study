package com.hello;

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


    }

}

// todo 15-03

