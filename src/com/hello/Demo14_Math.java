package com.hello;

public class Demo14_Math {

    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.abs(-10));  // 绝对值
        System.out.println(Math.ceil(12.3));  // 向上取整
        System.out.println(Math.ceil(12.99));  // 向上取整
        System.out.println(Math.floor(12.3));  // 向下取整
        System.out.println(Math.floor(12.99));  // 向下取整

        // 获取两个值的最大值
        System.out.println(Math.max(10,20));

        // pow  前面的是底数，后面的是指数
        System.out.println(Math.pow(2,3)); // 2的3次方  8.0

        // 生成0.0-1.0直接的随机数
        System.out.println(Math.random());

        // 四舍五入
        System.out.println(Math.round(9.99));


    }

}

// todo 14-12
