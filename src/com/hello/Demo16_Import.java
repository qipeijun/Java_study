package com.hello;

import static java.util.Arrays.sort; // 静态导入
import static java.util.Arrays.toString;

public class Demo16_Import {

    public static void main(String[] args){
        System.out.println("静态导入");

        /**
         * 静态导入是导入类中的静态方法
         *
         */

        int[] arr = {11,22,55,88,33,44,77};

        sort(arr);

//        System.out.println(toString(arr));

    }
}
