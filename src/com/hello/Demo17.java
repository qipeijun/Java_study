package com.hello;

import java.util.HashSet;

public class Demo17 {

    public static void main(String[] args){

        System.out.println("demo 17 set");

        HashSet<String> hashSet = new HashSet();
        hashSet.add("A");
        boolean b = hashSet.add("B");
        boolean c = hashSet.add("C");
        boolean c1 = hashSet.add("C");

        // 向set 集合中存储相同元素的时候，返回false
        System.out.println(b);
        System.out.println(c);
        System.out.println(c1);

        // set 集合无索引，不重复，存取不一致

        System.out.println(hashSet);

        // 只要能用迭代器的，都能用增强for循环
        for (String item: hashSet) {
            System.out.println(item);
        }

    }

}

// todo 17-05
