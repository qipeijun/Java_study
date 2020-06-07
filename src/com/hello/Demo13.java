package com.hello;

public class Demo13 {

    public static void main(String[] args){
        System.out.println("demo 13");

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());  // 0 容器中的字符个数，实际值
        System.out.println(sb.capacity()); // 16 容器的初始容量，理论值

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.length());  // 0
        System.out.println(sb2.capacity()); // 10

        StringBuffer sb3 = new StringBuffer("qipeijun");
        System.out.println(sb3.length());  // 8  实际字符的个数
        System.out.println(sb3.capacity()); // 24  字符串的length + 初始容量




    }

}
