package com.hello;

import java.util.Scanner;

public class Demo12 {

    public static void main(String[] args){

        System.out.println("demo 12");

        Scanner scanner = new Scanner(System.in);
        int x;
        if (scanner.hasNextInt()){
            x = scanner.nextInt();
            System.out.println(x);
        }else {
            System.out.println("输入的类型错误");
        }

        /**
         *  nextInt 是键盘录入整数的方法，当我们录入10的时候，
         *  其实就是在键盘上录入\r\n ，nextInt 方法只获取10就结束了
         *  nextLine 是键盘上录入字符串发方法，可以接受任意类型，但是它凭什么能获取一行呢?
         *  只要遇到\r\n 就证明一行结束
         *
         *  解决方案 重新new 一个实例 ，但是浪费空间
         *  键盘录入的都是字符串，都用 nextLine 方法，后面会学习将整数字符串转成整数的方法
         */
        String s = scanner.nextLine();
        System.out.println(s);


    }
}
