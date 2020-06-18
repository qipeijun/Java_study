package com.hello;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo15_Iterator {

    public static void main(String[] args){

        System.out.println("demo 15 iterator");

        Collection c = new ArrayList();

        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        // 对集合中的元素进行迭代
        Iterator it = c.iterator();  // 获取迭代器
        boolean b1 = it.hasNext(); // 判断集合中是否有元素，有就返回true
        Object obj = it.next();

        System.out.println(b1);
        System.out.println(obj);

        // 迭代
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
