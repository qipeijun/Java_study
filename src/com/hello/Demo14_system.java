package com.hello;

public class Demo14_system {

    public static void main(String[] args){

        new Demo();

//        System.exit(0); // 非0状态是异常终止，退出jvm
        System.out.println(111);

        long start = System.currentTimeMillis();
        for (int i = 0;i<1000;i++){
            System.out.println("*");
        }

        long end = System.currentTimeMillis();  //   currentTimeMillis 获取当前时间的毫秒值

        System.out.println(end-start); // 24

        int[] src = {11,22,33,44,55};
        int[] dest = new int[8];
        System.arraycopy(src,0,dest,0,src.length);  // 拷贝数组
        for (int i = 0;i<dest.length;i++){
            System.out.println(dest[i]);
        }


    }

}


class Demo{

    @Override
    public void finalize (){
        System.out.println("辣鸡被清扫了");
    }
}
