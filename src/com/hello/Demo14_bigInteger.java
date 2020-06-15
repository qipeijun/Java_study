package com.hello;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo14_bigInteger {

    public static void main(String[] args){

        // 可以让超过integer范围内的数据进行运算
        String s = "123456789987654321";

        BigInteger big = new BigInteger("100");
        BigInteger big1 = new BigInteger("100");
        System.out.println(big.add(big1)); // +
        System.out.println(big.subtract(big1)); // -
        System.out.println(big.multiply(big1)); // *
        System.out.println(big.divide(big1)); // /

        BigInteger[] arr = big.divideAndRemainder(big1);

        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



        //  BigDecimal  精确运算
//        BigDecimal bd = new BigDecimal(2.0);  // 这种方式，在开发中不推荐，因为不够精确
//        BigDecimal bd1 = new BigDecimal(1.1);
        BigDecimal bd = new BigDecimal("2.0");  // 通过构造中，传入字符串的方式，开发时推荐使用
        BigDecimal bd1 = new BigDecimal("1.1");
        System.out.println(bd.subtract(bd1));


        BigDecimal bd2 = BigDecimal.valueOf(2.0);  // 这种方式在开发中也是推荐的
        BigDecimal bd3 = BigDecimal.valueOf(1.1);
        System.out.println(bd2.subtract(bd3));



    }

}
