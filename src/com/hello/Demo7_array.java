package com.hello;

public class Demo7_array {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};

//        ArrayTool arrayTool = new ArrayTool();

        System.out.println(ArrayTool.getMax(arr));
        ArrayTool.showArrItem(arr);
//        System.out.println(arrayTool.revArr(arr));
        ArrayTool.showArrItem(ArrayTool.revArr(arr));

        int d = (int)(Math.random()*100);
        System.out.println(d);

    }

}
