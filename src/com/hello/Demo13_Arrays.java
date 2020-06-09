package com.hello;

import java.util.Arrays;

public class Demo13_Arrays {

    public static void main(String[] args){

        System.out.println("demo 13 array");

        // 数组转字符串
        int[] arr = {1,2,3,4,6,7};
        System.out.println(Arrays.toString(arr));

        // 排序
        Arrays.sort(arr);

        System.out.println(arr);

        // 查找
        System.out.println(Arrays.binarySearch(arr,1)); // 0

        System.out.println(Integer.MAX_VALUE);

        Integer i1 = new Integer(100);
        System.out.println(i1);

    }

}
