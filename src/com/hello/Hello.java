package com.hello;

public class Hello {
    public static void main(String[] agrs){
        System.out.println("hello world");
//        整数类型
        byte b = 10; // 占一个字节 -128 到127
        short s = 20; // 占两个字节
        int i = 30; // 占四个字节 整数默认数据类型就是int
        long x = 40; // 占八个字节
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(x);

//        浮点类型
        float f = 12.3f; // 占四个字节
        double d = 33.4; // 占八个字节
        System.out.println(f+d);

//        字符类型
        char c = 'a'; // 占两个字节
        System.out.println(c);


//        布尔类型
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);

//        字符串运算
        System.out.println('a'+1); // 98
        System.out.println((char)('a'+1)); // b
        System.out.println("hello"+1);
        System.out.println("a"+1);

        char c1 = 'a';
        System.out.println(c1);

        int index = 10;
        System.out.println(++index);

        System.out.println(10 /3);
        System.out.println(10/3.0);



    }
}
