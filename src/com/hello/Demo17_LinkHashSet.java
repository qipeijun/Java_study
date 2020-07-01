package com.hello;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Demo17_LinkHashSet {

    public static void main(String[] args){

        System.out.println("demo 17 link hash set");

        LinkedHashSet linkedHashSet = new LinkedHashSet();

//        linkedHashSet.add("a");
//        linkedHashSet.add("b");
//        linkedHashSet.add("c");
//        linkedHashSet.add("d");
//        linkedHashSet.add("d");

        System.out.println(linkedHashSet);

        /**
         *  底层是链表实现的，是set集合中唯一一个能保证怎么存就怎么取的集合对象
         */

        Random random = new Random();
        while (linkedHashSet.size() <= 10){
            int i = random.nextInt(20)+1;
            linkedHashSet.add(i);
        }

        System.out.println(linkedHashSet);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符");
        String str = scanner.nextLine();
        System.out.println(str);

        char[] c = str.toCharArray();

        HashSet<Character> h = new HashSet<>();
        for (char item:c) {
            h.add(item);
        }

        System.out.println(h);



    }

}
