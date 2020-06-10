package com.hello;

public class Demo14_Regex {

    public static void main(String[] args){

        System.out.println("demo 14 regex");

        String regex = "[abc]"; // []代表单个字符
        System.out.println("a".matches(regex));
        System.out.println("d".matches(regex));

        String regex1 = "[^abc]"; // 除了 abc
        System.out.println("a".matches(regex1));
        System.out.println("d".matches(regex1));

        /**
         *
         *  预定义字符类
         *  . 任意字符
         *  \d 数字 [0-9]
         *  \D 非数字 [^0-9]
         *  \s 空白字符
         *  \S  非空白字符 [^\s]
         *  \w 单词字符 [a-zA-Z_0-9]
         *  \W 非单词字符 [^\w]
         *
         *  数量词
         *  ？ 一次或一次也没有
         *  * 零次或多次
         *  + 一次或多次
         *  {n} 恰好n次
         *  {n,} 至少n次
         *  {n,m} 至少n次，不超过m次
         *
         */

    }

}


// todo 14-04