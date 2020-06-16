package com.hello;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo14_Date {

    public static void main(String[] args) throws ParseException {

        Date d = new Date(); // 不传代表当前时间
        System.out.println(d.getTime());


        Date d1 = new Date(0);  // 如果构造方法中，参数传为0，代表的时间是1970年1月1日 8:00

//        DataFormat df = DateFormat.getDateInstance();

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 创建日期格式化类对象  字符串指定格式
        System.out.println(sd.format(d));  // 20-6-15 下午11:38  默认格式


        // 将时间字符串 转化成日期对象
        String str = "2020-06-15 23:42:04";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf.parse(str);  // 将时间字符串转化成日期对象
        System.out.println(d2);

        // 计算出生到现在多少天
        String b = "1994-11-11";
        String n = "2020-06-16";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d3 = sdf1.parse(b);
        Date d4 = sdf1.parse(n);

        long time = d4.getTime()-d3.getTime();
        System.out.println(time/1000/60/60/24/365);



    }

}





