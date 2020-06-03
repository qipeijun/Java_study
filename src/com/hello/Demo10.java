package com.hello;
import com.world.Test;  // 导包
import java.util.*;  // 一般开发中，不这样导入，一般都是导入具体的类

public class Demo10 {

    public static void main(String[] args){

        System.out.println("demo 10");

        com.hello.Cat1 cat1 = new Cat1("蓝猫",1);
        cat1.hige();

        Test test = new Test();
        test.show();


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x);

    }



}


