package com.hello;

public class Demo5_methods {

    public static void main(String[] args) {

        System.out.println("demo 5 methods");

        double count = sum(1.2, 2);
        System.out.println(count);
        System.out.println(myName("戚", "培俊"));


    }


    /**
     * @param a
     * @param b
     * @return
     * @desc 求和
     */
    public static double sum(double a, double b) {

        return a + b;
    }


    /**
     * @param firstName
     * @param lastName
     * @return
     * @desc 拼接名字
     */
    public static String myName(String firstName, String lastName) {
        return firstName + lastName;
    }


}
