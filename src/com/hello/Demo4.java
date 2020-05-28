package com.hello;

public class Demo4 {

    public static void main(String[] args) {

        System.out.println("DEMO 4");

        for (int i = 0; i < 10; i++) {
            System.out.println("hello " + (i + 1));
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1-10的和是 " + sum);

//        1-100 之间的偶数和
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum2 += i;
            }else {
                sum3 +=i;
            }
        }
        System.out.println("1-100之间的偶数和 " + sum2);
        System.out.println("1-100之间的奇数和 " + sum3);


//        while 循环
        int index = 0;
        while (index < 100){
            index++;
            if (index>= 50) {
                break;
            }
            System.out.println(index);
        }



        


    }
}
