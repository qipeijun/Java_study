package com.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Demo15_List {

    public static void main(String[] args){

        System.out.println("DEMO 15 LIST");

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,10);  // 在指定位置添加元素
//        list.add(10,10);  // 当超过不存在的索引时，会存在索引异常，index <= size, 不能大于size


        System.out.println(list);


//        list.remove(1);
        Object del =  list.remove(1);  // 通过索引删除元素,删除的时候，不会自动装箱
        System.out.println(del);
        System.out.println(list);

        // get
        Object o = list.get(1);  // 根据索引获取元素
        System.out.println(o);

        // set
        list.set(1,22);
        System.out.println(list);


        ListIterator lit = list.listIterator(); // 获取迭代器，list集合特有的
        while (lit.hasNext()){
            int str = (int)lit.next();
            if (str == 1){
                lit.add(6);
            }
        }
        System.out.println(list);


        Vector v = new Vector();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        System.out.println(v);


    }

}


// 集合 查询快，增删慢
// 链表 查询慢，增删快

