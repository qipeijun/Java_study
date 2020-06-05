package com.hello;

public class Demo12_string {

    public static void main(String[] args){

        System.out.println("demo 12 string");

        // 字符串是常量，一旦赋值，就不能被改变，可以重写
        String str = "abc";
        str = "def"; //
        System.out.println(str);

        byte[] arr1 = {97,98,99};
        String str1 = new String(arr1);  // 解码，将计算机读的懂的转换成我们读的懂的
        System.out.println(str1);

        byte[] arr2 = {97,98,99,100,101,102};
        String s3 = new String(arr2,2,3); // 解码某部分
        System.out.println(s3);

        char[] arr3 = {'a','b','c','d'};
        String s4 = new String(arr3);
        String s5 = new String(arr3,2,2);
        System.out.println(s4);  // abcd   将字符数组转换成字符串
        System.out.println(s5);  // cd   将一部分字符数组转换成字符串

        String s6 = "abc";
        String s7 = "abc";
        System.out.println(s6.equals(s7)); // true
        System.out.println(s6.equalsIgnoreCase(s7)); // true  忽略大小写

        // ""和null 的区别，""是字符串常量，null 是什么都不是


    }

}
