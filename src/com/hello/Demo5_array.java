package com.hello;


public class Demo5_array {

    public static void main(String[] args) {

        System.out.println("数组");

        int[] arr = new int[5];  // 可以存储5个int类型的数据
        /**
         * 左边：
         * int 数据类型
         * [] 代表数组，几个中括号就代表几纬数组
         * arr 合法的标识
         */
        arr[0] = 10;
        System.out.println(arr[0]);


        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        arr1[0] = 10;
        arr2[1] = 20;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

//        数组 静态初始化
        int[] arr4 = new int[]{1, 3, 4, 5, 6};
        int[] arr5 = {1, 2, 3, 45, 6, 7};
        System.out.println(arr5.length);

        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        printArr(arr5);
        System.out.println(getMax(arr5));

        arrto();

    }

    /**
     * @param arr
     * @desc 打印数组
     */
    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    /**
     * @param arr
     * @return
     * @desc 获取数组最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void arrto() {
        int[][] arr7 = new int[3][2];
        System.out.println(arr7);
        System.out.println(arr7[0]);
        System.out.println(arr7[0][0]);
        int[] arr8[] = new int[3][2];

        int arr9[][] = new int[3][2];

        int[][] arr10 = {{1, 2, 3}, {4, 5, 6}};
        int sum = 0;
        for (int i = 0; i < arr10.length; i++) {
            int[] itemArr = arr10[i];
            System.out.println(itemArr);
            for (int j = 0; j < itemArr.length; j++) {
                int jItem = itemArr[j];
                System.out.println(jItem);
                sum += jItem;
            }
        }
        System.out.println("二维数组的和是: "+ sum);

    }




}
