package com.hello;

import java.util.Arrays;
import java.util.List;

public class Demo16_Aslist {

    public static void main(String[] args){

        System.out.println("数组 转 集合");

        String[] arr = {"A","B","C"};
        List<String> list = Arrays.asList(arr);
//        list.add("a");  // 数组转成集合，虽然不能增加或者减少元素，但是可以用集合的思想操作数组，也就是说可以使用其他的集合方法
        System.out.println(list);

    }
}
