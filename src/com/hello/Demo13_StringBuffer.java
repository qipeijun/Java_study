package com.hello;

public class Demo13_StringBuffer {

    public static void main(String[] args){

        System.out.println("demo 13 StringBuffer");


        /**
         *  添加
         *
         *  StringBuffer 是字符串缓冲区，当new 的时候是在堆内存创建了一个对象，底层是一个长度为16的字符串数组
         *  当调用添加方法时，不会再重新创建对象，在不断向原缓冲区添加字符
         *  StringBuffer 类中重写了toString方法，显示的是对象
         */
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);  // 相当于 sb.toString()

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append(true);
        StringBuffer sb4 = sb2.append(1);
        StringBuffer sb5 = sb2.append("qipeijun");

        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
        System.out.println(sb4.toString());
        System.out.println(sb5.toString());


        // 插入
        StringBuffer sb6 = new StringBuffer("1234");
        sb6.insert(3,"qipeijun");  // 在指定位置添加元素，如果没有指定位置的索引，就会报错 字符串索引越界
//        System.out.println(sb6); // insert(3,"qipeijun"); 报错 字符串越界
        System.out.println(sb6);

        // 删除
        StringBuffer sb7 = new StringBuffer("qipeijun");
//        sb7.deleteCharAt(5); // 报错 索引越界异常，当缓冲区中没有元素的时候，就会报字符串索引异常
//        sb7.deleteCharAt(1); // 删除 下标1的字符
        sb7.delete(0,2);  // 包含头 不包含尾
        sb7.delete(0,sb7.length());  // 清空
//        sb7 = new StringBuffer();  // 不要用这种方式清空缓存区，原来的会变成垃圾，浪费内存
        System.out.println(sb7);

        // 替换
        StringBuffer sb8 = new StringBuffer("qipeijun");
        sb8.replace(0,2,"QI");  // star，end，str 包含头，不包含尾
        System.out.println(sb8);

        // 反转
        StringBuffer sb9 = new StringBuffer("qipeijun");
        sb9.reverse();
        System.out.println(sb9);

        /**
         *
         *  StringBuffer 注意事项
         *      返回值类型不再是StringBuffer本身
         *
         */

        // StringBuffer 和 String 的相互转换
        StringBuffer sb10 = new StringBuffer("qipeijun");  // 通过构造方法将字符串转换为StringBuffer 对象
        System.out.println(sb10);

        // 通过 append方法

//        todo 13-7


    }

}
