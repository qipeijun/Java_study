package com.hello;

public class Demo11_hashCode {

    public static void main(String[] args){

        System.out.println("demo 11 hash code");

        Object object = new Object();
        int hashCode = object.hashCode();
        System.out.println(hashCode);

        Cat cat = new Cat();
        Class s = cat.getClass();  // 获取该对象的字节码文件
        System.out.println(s);

        String name = s.getName();  // 获取名称

        System.out.println(name);

    }

}
