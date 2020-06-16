package com.hello;

import java.util.Calendar;
import java.util.Scanner;

public class Demo14_Calendar {

    public static void main(String[] args){

        System.out.println("demo 14 calendar");

        Calendar c = Calendar.getInstance();  // 父类引用指向子类对象
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK)-1); // 周日是第一天，周六是最后一天
        System.out.println(getWeek(c.get(Calendar.DAY_OF_WEEK))); // 周日是第一天，周六是最后一天
//        c.add(Calendar.YEAR,-1); // 减一年
        c.set(Calendar.YEAR,2000); // 设置某一年


        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int year = Integer.parseInt(line);

        boolean b = getYear(year);
        System.out.println(b);


    }

    private static boolean getYear(int year) {
        Calendar c = Calendar.getInstance();
        c.set(year,2,1); // 设置为那年的3月1号
        c.add(Calendar.DAY_OF_MONTH,-1);

        return c.get(Calendar.DAY_OF_MONTH) == 29;
    }

    public static String getWeek(int week){
        String[] arr = {"星期一","星期天","星期一","星期二","星期三","星期四","星期五","星期六",};
        return arr[week];
    }

}
