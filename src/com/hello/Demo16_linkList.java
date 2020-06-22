package com.hello;

import java.util.LinkedList;

public class Demo16_linkList {

    public static void main(String[] args){
        System.out.println("demo 16 link list");

        LinkedList linkedList= new LinkedList();

        linkedList.addFirst("a");
        linkedList.addFirst("a");
        linkedList.addFirst("a");
        linkedList.addLast("b");
        linkedList.addFirst("a");
        linkedList.addFirst("a");

        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();

        while (!linkedList.isEmpty()){
            linkedList.removeLast();
        }

        System.out.println(linkedList);

    }

}
