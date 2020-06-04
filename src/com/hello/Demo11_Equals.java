package com.hello;

public class Demo11_Equals {

    public static void main(String[] args){

        System.out.println("demo 11 equals");

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.equals(s2));  // false 为什么不相等。  内存地址不一样
        System.out.println(s1 == s2);  // false

    }

}


/**
 *  == 和 equals的区别
 *   都可以用来做比较，返回值都是布尔类型
 *
 *   区别 == 是比较运算符 既可以比较基本数据类型，也可以比较引用数据类型，基本数据类型比较的是值，引用数据类型比较的是内存地址值
 *
 *   equals 方法在没有重写之前，比较的是地址值，依赖的是 底层 == ，但是比较地址值是没有意义的，我们需要重写equals方法，比较对象中的属性值
 *   equals 只能比较的是引用数据类型
 *
 */
