package com.hello;

import java.util.TreeSet;

public class Demo17_TreeSet {

    public static void main(String[] args){

        System.out.println("demo 17 tree set");

        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        System.out.println(treeSet);

        /**
         * treeSet 集合是用来对元素进行排序，同样也可以保证元素的唯一
         */

    }

}


//todo 17-16
