package com.hello;

/**
 * @desc 这个一个数组工具类，里面封装了获取数组最大值，打印数组，反转数组
 * @author qipeijun
 * @version v1.0.0
 */
public final class ArrayTool {

//    如果一个类中，所有的方法都是静态的，需要多做一步，私有构造方法

    /**
     * 私有构造方法
     */
    ArrayTool(){};

    /**
     * 获取最大值
     * @param arr
     * @return
     */
    public static final int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    /**
     * 数组遍历
     * @param arr
     */
    public static final void showArrItem(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    /**
     * 数组反转
     * @param arr
     * @return 反转后的数组
     */
    public static final int[] revArr(int[] arr){
        for (int i = 0; i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public static final char[] revArr(char[] arr){
        for (int i = 0; i<arr.length/2;i++){
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

}
