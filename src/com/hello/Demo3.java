package com.hello;
import java.util.Scanner;

public class Demo3 {

    public static void main(String[] agrs) {

        System.out.println("Demo2");
        int x = 10;
        System.out.println(x > 5 &  x < 15);

        System.out.println( false | true);

        System.out.println(!true);

        Scanner sc = new Scanner(System.in); //创建键盘录入对象
        System.out.println("请输入一个整数");
        int xx = sc.nextInt(); // 将键盘录入的数据存入
        System.out.println("请输入第二个整数");
        int yy = sc.nextInt(); // 将键盘录入的数据存入
        System.out.println(xx+yy);
        if (yy > 18){
            System.out.println("可以看网站");
        }else {
            System.out.println("不可以看");
        }

        int ss = 100;
        switch (ss){
            case 1:
                System.out.println("1");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("default");
        }

    }

}
