package com.hello;

import java.util.Arrays;

public class Demo14_Split {

    public static void main(String[] args){

        String s = "金三胖.郭美美.李四";
        String[] arr = s.split("\\.");
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        String s1 = "22 11 76 98 12 9 7";
        String[] arr1 = s1.split(" ");
        int[] arrInt = new int[arr1.length];
        for (int i = 0;i<arr1.length;i++){
            arrInt[i] = Integer.parseInt(arr1[i]);
        }

        // 排序
        Arrays.sort(arrInt);
        StringBuffer s3 = new StringBuffer();
        for (int i = 0;i<arrInt.length;i++){
            s3.append(arrInt[i]+" ");
        }

        System.out.println(s3.toString().trim());

    }

}
